package guru.springframework.domain;

import javax.persistence.*;
import lombok.*;
@Data
@EqualsAndHashCode(exclude = {"recipe"}) //exclude recipe = OneToOne relationship lombok creates circular reference
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne //no cascade - delete notes still has recipe remaining in database
    private Recipe recipe;

    @Lob  //large object - can write long string
    private String recipeNotes;

}
