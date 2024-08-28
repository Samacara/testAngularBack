package recuperer.donnees.codeBarre.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recuperer.donnees.codeBarre.Entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    Produit findByCodeProduit(String codeProduit);
}
