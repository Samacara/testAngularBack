package recuperer.donnees.codeBarre.Controller.Api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recuperer.donnees.codeBarre.Entity.Categorie;

public interface CategorieApi {


    @PostMapping("/api/v1/categories/creer")
    public ResponseEntity<Object> saveCategorie(@RequestBody Categorie categorie);

    @PutMapping("/api/v1/categories/id/{idCategorie}")
    public ResponseEntity<Object> updateCategorie(@RequestBody Categorie categorie, @PathVariable(value = "idCategorie") Integer idCategorie);

    @GetMapping("/api/v1/categories/sama/{idCategorie}")
    public ResponseEntity<Object> GetOneCategorie(@PathVariable(value = "idCategorie") Integer idCategorie);



    @GetMapping("/api/v1/categories")
    public ResponseEntity<Object> GetAllCategorie();

    @DeleteMapping("/api/v1/categories/{idCategorie}")
    public void DeleteCategorie(@PathVariable(value = "idCategorie") Integer idCategorie);


}
