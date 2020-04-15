package hellojpa2.hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {


            Team team = new Team();
            team.setName("TeamA");
            em.persist(team);

            Member2 member2 = new Member2();
            member2.setUsername("member1");
            member2.changeTeam(team);
            em.persist(member2);

            Team findTeam = em.find(Team.class, team.getId());
            List<Member2> members = findTeam.getMembers(); //(members가 null이다.)

            System.out.println("================");
            for(Member2 m : members){
                System.out.println("members = " + m.getUsername());
            }
            System.out.println("================");


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
