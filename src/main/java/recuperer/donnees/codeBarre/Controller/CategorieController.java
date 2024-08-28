package recuperer.donnees.codeBarre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import recuperer.donnees.codeBarre.Controller.Api.CategorieApi;
import recuperer.donnees.codeBarre.Entity.Categorie;
import recuperer.donnees.codeBarre.Service.CategorieService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController()
public class CategorieController implements CategorieApi {
    private CategorieService categorieService;

    @Autowired
    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }


    @Override
    public ResponseEntity<Object> saveCategorie(Categorie categorie) {
        return ResponseEntity.ok().body(categorieService.saveCategorie(categorie));
    }

    @Override
    public ResponseEntity<Object> updateCategorie(Categorie categorie, Integer idCategorie) {
        return ResponseEntity.ok().body(categorieService.updateCategorie(categorie,idCategorie));
    }


    @Override
    public ResponseEntity<Object> GetOneCategorie(Integer idCategorie) {
        return ResponseEntity.ok().body(categorieService.getCategorieById(idCategorie));
    }



    @Override
    public ResponseEntity<Object> GetAllCategorie() {
        return ResponseEntity.ok().body(categorieService.getAllCategorie());
    }

    @Override
    public void DeleteCategorie(Integer idCategorie) {
        categorieService.DeleteCategorie(idCategorie);
    }
}

