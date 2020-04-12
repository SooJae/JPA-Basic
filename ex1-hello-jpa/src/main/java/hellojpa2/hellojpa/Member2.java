package hellojpa2.hellojpa;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String username;


    public Member2() { }


}
