package hellojpa3.hellojpa;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Album3 extends Item3 {
    private String artist;
}
