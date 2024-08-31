package recuperer.donnees.codeBarre.Service;

import recuperer.donnees.codeBarre.Entity.Categorie;

import java.util.List;

public interface CategorieService {
    public Categorie saveCategorie(Categorie categorie);



    public Categorie updateCategorie(Categorie categorie, Integer idCategorie);

    public Categorie getCategorieById(Integer idCategorie);

    public List<Categorie> getAllCategorie();


    public Categorie getCategorieByNom(String nomCategorie);

    public void DeleteCategorie(Integer idCategorie);
}
