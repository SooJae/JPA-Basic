package hellojpa3.hellojpa;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

public class JpaMain3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Team3 team3 = new Team3();
            team3.setName("SOOTEAM");
            em.persist(team3);

            Team3 team4 = new Team3();
            team4.setName("soojae2");
            em.persist(team4);

            Member3 member3 = new Member3();
            member3.setUsername("hello");
            member3.setTeam(team3);
            em.persist(member3);

            Member3 member4 = new Member3();
            member4.setUsername("hello");
            member4.setTeam(team4);
            em.persist(member4);


            em.flush();
            em.clear();

            List<Member3> members = em.createQuery("select m from Member3 m join fetch m.team", Member3.class).getResultList();


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

}
