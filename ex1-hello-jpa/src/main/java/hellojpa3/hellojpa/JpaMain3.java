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
            Member3 member = new Member3();
            member.setUsername("soojkae");
            member.setHomeAddress(new Address("city", "street", "1000"));
            member.setWorkPeriod(new Period());

            em.persist(member);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

}
