package hellojpa3.hellojpa2.hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member3 {

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
    private List<Product3> memberProducts = new ArrayList<Product3>();



}
