package recuperer.donnees.codeBarre.Controller.Api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recuperer.donnees.codeBarre.Entity.Produit;

public interface ProduitApi {


    @PostMapping("/api/v1/produits/creer/{idCategorie}")
    public ResponseEntity<Object> saveProduit(@RequestBody Produit produit, @PathVariable(value = "idCategorie") Integer idCategorie);

    @PutMapping("/api/v1/produits/id/{idProduit}")
    public ResponseEntity<Object> updateProduit(@RequestBody Produit produit, @PathVariable(value = "idProduit") Integer idProduit);
    
    @GetMapping("/api/v1/produits/sama/{idProduit}")
    public ResponseEntity<Object> GetOneProduit(@PathVariable(value = "idProduit") Integer idProduit);

    @GetMapping("/api/v1/produits/{codeProduit}")
    public ResponseEntity<Object> getProduitByCodeProduit(@PathVariable("codeProduit") String codeProduit);


    @GetMapping("/api/v1/produits")
    public ResponseEntity<Object> GetAllProduit();

    @DeleteMapping("/api/v1/produits/{idProduit}")
    public void DeleteProduit(@PathVariable(value = "idProduit") Integer idProduit);


}
