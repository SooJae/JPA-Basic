package hellojpa3.hellojpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class JpaMain3 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            Member3 member = new Member3();
            member.setCreatedBy("soo");
            member.setCreatedDate(LocalDateTime.now());


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
