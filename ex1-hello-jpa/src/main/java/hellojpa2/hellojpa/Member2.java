package hellojpa2.hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member2 {

    @Id
    private Long id;
    private String name;

    public Member2(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Member2() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
