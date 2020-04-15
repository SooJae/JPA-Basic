package hellojpa2.hellojpa;

import hellojpa.Member;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team {
    @Id
    @GeneratedValue
    @Column(name="team_id")
    private Long id;
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member2> members = new ArrayList<Member2>();
}
