/**
 * Created by athena2651cn on 13-12-18.
 */
public class Ville {

    public static int nbrInstances = 0;
    public static int nbrInstancesBis = 0;
    private String nomVille;
    private String nomPays;
    private int nbrHabitants;
    private char categorie;

    public Ville() {
        nbrInstances++;
        nbrInstancesBis++;
        System.out.println("Création d'une ville !");
        nomVille = "Inconnue";
        nomPays = "Inconnue";
        this.setCategorie();
    }

    public Ville(String nomVille, String nomPays, int nbrHabitants) {
        nbrInstances++;
        nbrInstancesBis++;
        System.out.println("Création d'une ville avec des paramètres !");
        this.nomVille = nomVille;
        this.nomPays = nomPays;
        this.nbrHabitants = nbrHabitants;
        this.setCategorie();
    }


    public static int getNbrInstances() {
        return nbrInstances;
    }

    public static void setNbrInstances(int nbrInstances) {
        Ville.nbrInstances = nbrInstances;
    }

    public static int getNbrInstancesBis() {
        return nbrInstancesBis;
    }

    public static void setNbrInstancesBis(int nbrInstancesBis) {
        Ville.nbrInstancesBis = nbrInstancesBis;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getNbrHabitants() {
        return nbrHabitants;
    }

    public void setNbrHabitants(int nbrHabitants) {
        this.nbrHabitants = nbrHabitants;
    }

    public char getCategorie() {
        return categorie;
    }

    private void setCategorie(){
        int bornesSuperieurs[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
        char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        int i = 0;
        while (i < bornesSuperieurs.length && this.nbrHabitants >= bornesSuperieurs[i])
            i++;
        this.categorie = categories[i];
    }

    public String decrisToi(){
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbrHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
    }

    public String comparer(Ville v1){
        String str = new String();
        if (v1.getNbrHabitants() > this.getNbrHabitants()){
            str = v1.getNomVille() + "est une ville plus peuplée que " + this.getNomVille();
        }else {
            str = this.getNomVille() + "est une ville plus peuplée que " + v1.getNomPays();
        }
        return str;
    }

}
