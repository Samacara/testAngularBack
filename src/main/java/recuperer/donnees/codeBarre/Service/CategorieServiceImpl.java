package recuperer.donnees.codeBarre.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import recuperer.donnees.codeBarre.Entity.Categorie;
import recuperer.donnees.codeBarre.Repository.CategorieRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {


    private CategorieRepository categorieRepository ;
    @Autowired
    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }


    @Override
    public Categorie saveCategorie(Categorie categorie) {

        Categorie ca = categorieRepository.save(categorie);
        return ca;
    }



    @Override
    public Categorie updateCategorie(Categorie categorie, Integer idCategorie) {
        if (idCategorie == null){
            return null;
        }
        Categorie ca = categorieRepository.findById(idCategorie).get();

        ca.setNomCategorie(categorie.getNomCategorie());
        ca.setDateCreation(categorie.getDateCreation());
        ca.setDateModification(categorie.getDateModification());

        return categorieRepository.save(ca);
    }


    @Override
    public Categorie getCategorieById(Integer idCategorie) {

        if (idCategorie == null){
            throw new RuntimeException("Categorie non trouvé pour  : " + idCategorie);
        }

        Categorie ca = categorieRepository.findById(idCategorie).get();
        return ca;

    }

    @Override
    public List<Categorie> getAllCategorie() {
        List<Categorie> data = categorieRepository.findAll();
        List<Categorie> list = new ArrayList<>();

        for (Categorie prod : data){
            list.add(prod);

        }

        return list;
    }

    @Override
    public Categorie getCategorieByNom(String nomCategorie) {
        if(nomCategorie.isEmpty()){
            return null;
        }
        return categorieRepository.findCategorieByNomCategorie(nomCategorie);
    
    }

    @Override
    public void DeleteCategorie(Integer idCategorie) {

        categorieRepository.deleteById(idCategorie);

    }
}
