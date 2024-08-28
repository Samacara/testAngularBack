package recuperer.donnees.codeBarre.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import recuperer.donnees.codeBarre.Entity.Produit;
import recuperer.donnees.codeBarre.Service.ProduitService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdController {

    @Autowired
    ProduitService produitService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Produit> getAllProduit()
    {
        return produitService.getAllProduit();
    }
}
