package hellojpa3.hellojpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Book3 extends Item3{

    private String author;
    private String isbn;
}
