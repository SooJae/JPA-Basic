package hellojpa3.hellojpa2.hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team3 {
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
