package hellojpa2.hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Member2 {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name="username")
    private String username;

    public Member2() { }

//    @Column(name = "team_id")
//    private Long teamId;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    public void changeTeam(Team team){
        this.team = team;
        team.getMembers().add(this);
    }


}
