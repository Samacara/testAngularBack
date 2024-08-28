package recuperer.donnees.codeBarre.Service;

import recuperer.donnees.codeBarre.Entity.Produit;

import java.util.List;

public interface ProduitService {


    public Produit saveProduit(Produit produit, Integer idCategorie);

    public Produit getProduitByCodeBarre(String codeProduit);

    public Produit updateProduit(Produit produit, Integer idProduit);

    public Produit getProduitById(Integer idProduit);

    public List<Produit> getAllProduit();

    public void DeleteProduit(Integer idProduit);
}
