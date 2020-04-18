package hellojpa3.hellojpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class Item3 {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private int price;
}
