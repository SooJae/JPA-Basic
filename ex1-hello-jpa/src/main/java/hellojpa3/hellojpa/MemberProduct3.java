package hellojpa3.hellojpa;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class MemberProduct3 {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member3 member;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product3 product;

    private int count;
    private int price;
    private LocalDateTime orderDateTime;
}
