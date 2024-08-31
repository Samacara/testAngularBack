package recuperer.donnees.codeBarre.Controller.Api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recuperer.donnees.codeBarre.Entity.Produit;

public interface ProduitApi {


    @PostMapping("/api/v1/produits/creer/{idCategorie}")
    public ResponseEntity<Object> saveProduit(@RequestBody Produit produit, @PathVariable(value = "idCategorie") Integer idCategorie);

    @PutMapping("/api/v1/produits/cat/{idProduit}")
    public ResponseEntity<Object> updateProduit(@RequestBody Produit produit, @PathVariable(value = "idProduit") Integer idProduit);
    
    @GetMapping("/api/v1/produits/sama/{idProduit}")
    public ResponseEntity<Object> getOneProduit(@PathVariable(value = "idProduit") Integer idProduit);

    @GetMapping("/api/v1/produits/designation/{designation}")
    public ResponseEntity<Object> getProduitByDesignation(@PathVariable("designation") String designation);


    @GetMapping("/api/v1/produits")
    public ResponseEntity<Object> getAllProduit();

    @DeleteMapping("/api/v1/produits/{idProduit}")
    public void deleteProduit(@PathVariable(value = "idProduit") Integer idProduit);

    @GetMapping("/api/v1/produits/{categorieId}/categories")
    public ResponseEntity<Object> getProduitByIdCategorie(@PathVariable(value = "categorieId") Integer categorieId);

//    @GetMapping("/api/v1/produits/nom/{nomCategorie}/categories")
//    public ResponseEntity<Object> getCategorieAllProduit(@PathVariable(value = "nomCategorie") String nomCategorie);



}
