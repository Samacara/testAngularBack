package recuperer.donnees.codeBarre.Entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString
@Entity
@Table(name = "categorie")
public class Categorie extends BaseEntity {

    private String nomCategorie;

    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
    List<Produit> produits;

}