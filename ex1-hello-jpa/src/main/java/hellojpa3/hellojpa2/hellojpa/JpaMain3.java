package hellojpa3.hellojpa2.hellojpa;

import hellojpa2.hellojpa.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Member3 member = saveMember(em);

            Team3 team = new Team3();
            team.setName("teamA");
//            team.getMembers().add(member);

            em.persist(team);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

    private static Member3 saveMember(EntityManager em) {
        Member3 member = new Member3();
        member.setUsername("member1");

        em.persist(member);
        return member;
    }
}
