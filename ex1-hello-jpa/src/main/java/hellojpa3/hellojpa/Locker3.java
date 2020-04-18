package hellojpa3.hellojpa;

import javax.persistence.*;

@Entity
public class Locker3 {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "locker")
    private Member3 member3;
}
