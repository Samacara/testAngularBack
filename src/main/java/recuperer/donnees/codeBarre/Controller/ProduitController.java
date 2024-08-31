package recuperer.donnees.codeBarre.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import recuperer.donnees.codeBarre.Controller.Api.ProduitApi;
import recuperer.donnees.codeBarre.Entity.Produit;
import recuperer.donnees.codeBarre.Service.ProduitService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
public class ProduitController implements ProduitApi {
    private ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }


    @Override
    public ResponseEntity<Object> saveProduit(Produit produit, Integer idCategorie) {
        return ResponseEntity.ok().body(produitService.saveProduit(produit, idCategorie));
    }

    @Override
    public ResponseEntity<Object> updateProduit(Produit produit, Integer idProduit) {
        return ResponseEntity.ok().body(produitService.updateProduit(produit,idProduit));
    }


    @Override
    public ResponseEntity<Object> getOneProduit(Integer idProduit) {
        return ResponseEntity.ok().body(produitService.getProduitById(idProduit));
    }

    @Override
    public ResponseEntity<Object> getProduitByDesignation(String designation) {
        return ResponseEntity.ok().body(produitService.getProduitByDesignation(designation));
    }

    @Override
    public ResponseEntity<Object> getAllProduit() {
        return ResponseEntity.ok().body(produitService.getAllProduit());
    }

    @Override
    public void deleteProduit(Integer idProduit) {
        produitService.DeleteProduit(idProduit);
    }

    @Override
    public ResponseEntity<Object> getProduitByIdCategorie(Integer categorieId) {
        return ResponseEntity.ok().body(produitService.getProduitByCategorie(categorieId));
    }

//    @Override
//    public ResponseEntity<Object> getCategorieAllProduit(String nomCategorie) {
//        return ResponseEntity.ok().body(produitService.getCategorieAllProduit(nomCategorie));
//    }
}

