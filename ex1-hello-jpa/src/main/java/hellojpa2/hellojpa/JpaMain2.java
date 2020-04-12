package hellojpa2.hellojpa;

import hellojpa.Member;

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

            //영속
            Member2 member1 = new Member2(150L, "A");
            Member2 member2 = new Member2(160L, "B");

            em.persist(member1);
            em.persist(member2);

            System.out.println("=================");

            Member2 member21 = em.find(Member2.class, 150L);
            member21.setName("ZZZZ");
            em.persist(member21);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
