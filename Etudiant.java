public class Etudiant
{
    private String nom;
    private String prenom;
    private Integer anneeNaiss;
    private String sexe;
    
    
    public Etudiant(String nom, String prenom, Integer anneeNaiss, String sexe)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaiss = anneeNaiss;
        this.sexe = sexe;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setPrenom(String prenom)
    {
        this.nom = nom;
    }

    public void setAnneeNaiss(Integer anneeNaiss)
    {
        this.anneeNaiss = anneeNaiss;
    }

    public void setSexe(String sexe)
    {
        this.sexe = sexe;
    }

    public String getNom()
    {
        return this.nom;
    }

    public String getPrenom()
    {
        return this.prenom;
    }

    public Integer getAnneeNaiss()
    {
        return this.anneeNaiss;
    }

    public String getSexe()
    {
        return this.sexe;
    }

    public String toString()
    {
        return "se nomme " +this.getNom()+ " " +this.getPrenom()+ ", né en " +this.getAnneeNaiss()+ " de sexe " +this.getSexe()+ ".";
    }

    public static void main(String[] args) {
        
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("Auteur Mahamat Legrand Ngouh Nkainsa");

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        /* Création de cinques étudiant */

        Etudiant E1 = new Etudiant("Mahamat", "Legrand", 1994, "Masculin");
        Etudiant E2 = new Etudiant("Bryan", "Jefferson", 1986, "Masculin");
        Etudiant E3 = new Etudiant("Larry", "Page", 1974, "Masculin");
        Etudiant E4 = new Etudiant("Marylin", "Cynthia", 1998, "Feminin");
        Etudiant E5 = new Etudiant("Kendra", "Jones", 1993, "Feminin");

        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("Affichage Des Cinque Etudiants créer");

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("\n---------------------------------------------------");

        System.out.println("L'etudiant N° 1 " +E1.toString() +"\n");
        System.out.println("L'etudiant N° 2 " +E2.toString() +"\n");
        System.out.println("L'etudiant N° 3 " +E3.toString() +"\n");
        System.out.println("L'etudiant N° 4 " +E4.toString() +"\n");
        System.out.println("L'etudiant N° 5 " +E5.toString() +"\n");

        System.out.println("---------------------------------------------------\n");

        /* Modification De L'AnneeNaiss Des Cinques Etudiants créer */

        E1.setAnneeNaiss(1993);
        E2.setAnneeNaiss(1985);
        E3.setAnneeNaiss(1973);
        E4.setAnneeNaiss(1997);
        E5.setAnneeNaiss(1992);

        /* Affichage Des Modification effectuer sur les Cinques Etudiants créer */

        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("Après modifications, les informations sur les etudiants sont les suivantes:");

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
        
        System.out.println("\n°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("L'etudiant N° 1 " +E1.toString() +"\n");
        System.out.println("L'etudiant N° 2 " +E2.toString() +"\n");
        System.out.println("L'etudiant N° 3 " +E3.toString() +"\n");
        System.out.println("L'etudiant N° 4 " +E4.toString() +"\n");
        System.out.println("L'etudiant N° 5 " +E5.toString() +"\n");

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n");

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°FIN DU PROGRAMME°°°°°°°°°°°°°°°°°°°°°°°°°");

        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        
        
    }

}