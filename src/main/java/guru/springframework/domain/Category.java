package guru.springframework.domain;

import javax.persistence.*;
import lombok.*;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipes"})  //exclude recipes bc ManyToMany - lombok makes circular reference
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
