package recuperer.donnees.codeBarre.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "produit")
public class Produit extends BaseEntity {



    @Column(name = "designation")
    private String designation;

    @Column(name = "prixUnitaire")
    private Integer prixUnitaire;

    @Column(name = "codeProduit")
    private String codeProduit;

    @ManyToOne
    @JoinColumn(name = "idCategorie")
    @JsonIgnore
    private Categorie categorie;


}
