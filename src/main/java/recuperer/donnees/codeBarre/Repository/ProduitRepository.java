package recuperer.donnees.codeBarre.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recuperer.donnees.codeBarre.Entity.Produit;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
  List <Produit> findByDesignationContains(String designation);

}
