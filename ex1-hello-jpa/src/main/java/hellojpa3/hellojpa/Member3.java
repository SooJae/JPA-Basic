package hellojpa3.hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="team_id")
    private Team3 team;

    @OneToMany(mappedBy = "member")
    private List<MemberProduct3> memberProducts = new ArrayList<>();

    // 기간 Period
    @Embedded
    private Period workPeriod;

    // 주소
    @Embedded
    private Address homeAddress;

    // 주소
//    @Embedded
//    private Address workAddress;

}
