package recuperer.donnees.codeBarre.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recuperer.donnees.codeBarre.Entity.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
}
