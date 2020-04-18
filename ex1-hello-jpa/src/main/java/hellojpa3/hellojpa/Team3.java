package hellojpa3.hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Team3 extends BaseEntity3 {
    @Id
    @GeneratedValue
    @Column(name="team_id")
    private Long id;
    private String name;
//
//    @OneToMany(mappedBy = "team")
//    @JoinColumn(name = "team_id")
//    private List<Member3> members = new ArrayList<Member3>();



}
