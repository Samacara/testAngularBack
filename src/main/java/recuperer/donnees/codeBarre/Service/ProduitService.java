package recuperer.donnees.codeBarre.Service;

import recuperer.donnees.codeBarre.Entity.Produit;

import java.util.List;

public interface ProduitService {


    public Produit saveProduit(Produit produit, Integer idCategorie);

    public List <Produit> getProduitByDesignation(String designation);

    public Produit updateProduit(Produit produit, Integer idProduit);

    public Produit getProduitById(Integer idProduit);

    public List<Produit> getAllProduit();

//    public List<Produit> getCategorieAllProduit(String nomCat);

    public List<Produit> getProduitByCategorie(Integer idCat);


    public void DeleteProduit(Integer idProduit);
}
