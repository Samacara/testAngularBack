package recuperer.donnees.codeBarre.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import recuperer.donnees.codeBarre.Entity.Categorie;


//@RepositoryRestRessource(pa)
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
    Categorie findCategorieByNomCategorie(String nomCategorie);
}
