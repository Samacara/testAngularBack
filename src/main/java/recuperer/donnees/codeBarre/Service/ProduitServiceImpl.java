package recuperer.donnees.codeBarre.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recuperer.donnees.codeBarre.Entity.Categorie;
import recuperer.donnees.codeBarre.Entity.Produit;
import recuperer.donnees.codeBarre.Repository.ProduitRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProduitServiceImpl implements ProduitService {

    private CategorieService categorieService;
    private ProduitRepository produitRepository ;

    @Autowired
    public ProduitServiceImpl(CategorieService categorieService, ProduitRepository produitRepository) {
        this.categorieService = categorieService;
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit saveProduit(Produit produit, Integer idCategorie) {
        if (idCategorie == null){
            return null;
        }
        Categorie ca = categorieService.getCategorieById(idCategorie);
        produit.setCategorie(ca);

        Produit pro = produitRepository.save(produit);
        return pro;
    }

    @Override
    public Produit getProduitByCodeBarre(String codeProduit) {
        Produit produit = produitRepository.findByCodeProduit(codeProduit);
        if (produit == null) {
            throw new RuntimeException("Produit non trouvé pour le codeProduit : " + codeProduit);
        }
        return produit;
    }

    @Override
    public Produit updateProduit(Produit produit, Integer idProduit) {
             if (idProduit == null){
            return null;
        }
        Produit prod = produitRepository.findById(idProduit).get();

        prod.setDesignation(produit.getDesignation());
        prod.setCategorie(produit.getCategorie());
        prod.setCodeProduit(produit.getCodeProduit());
        prod.setPrixUnitaire(produit.getPrixUnitaire());
        prod.setDateCreation(produit.getDateCreation());
        prod.setDateModification(produit.getDateModification());

        return produitRepository.save(prod);
    }


    @Override
    public Produit getProduitById(Integer idProduit) {

        if (idProduit == null){
            throw new RuntimeException("Produit non trouvé pour  : " + idProduit);
        }

        Produit ca = produitRepository.findById(idProduit).get();
        return ca;

    }

    @Override
    public List<Produit> getAllProduit() {
        List<Produit> data = produitRepository.findAll();
        List<Produit> list = new ArrayList<>();

        for (Produit prod : data){
           list.add(prod);

        }

        return list;
    }

    @Override
    public void DeleteProduit(Integer idProduit) {

        produitRepository.deleteById(idProduit);

    }
}
