package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            /**
             * Insert
             */
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("HelloA");
//            em.persist(member);

            /**
             * select
             */
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());

            /**
             * Update
             */
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("helloJPA");

            /**
             * JPQL
             */
            List<Member> result = em.createQuery("select m from Member2 as m", Member.class)
//                    pagination
                    .setFirstResult(1)
                    .setMaxResults(10)
                    .getResultList();
            // JPQL은 테이블을 대상 X 객체를 대상으로 O, 즉 테이블이 대상이 아니라 객체를 대상으로 쿼리를 날린다.

            for (Member member : result) {
                System.out.println("member.name = " + member.getName());
            }
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
