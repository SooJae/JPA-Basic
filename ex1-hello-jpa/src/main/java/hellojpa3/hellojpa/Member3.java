package hellojpa3.hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member3 extends BaseEntity3 {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name="username")
    private String username;

    @OneToOne
    @JoinColumn(name = "locker_id")
    private Locker3 locker;

    @OneToMany(mappedBy = "member")
    private List<MemberProduct3> memberProducts = new ArrayList<>();



}
