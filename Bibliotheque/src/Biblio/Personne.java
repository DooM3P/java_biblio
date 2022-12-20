package Biblio;


abstract class Personne {
	private String nom;
	private String prenom;
	private String idPersonne;
	private String adresse;
	
	//Getters
    public String getNom() {
        return this.nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public String getAdresse() {
        return this.adresse;
    }
    public String getIdPersonne() {
        return this.idPersonne;
    }
	
    //Setters
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	
	public Personne(String prenom, String nom, String adresse) {
		String idPersonnes = prenom+" "+nom;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.idPersonne = idPersonnes;
	}
	
	public Personne(String nom, String prenom) {
		this(nom,prenom,"Adresse Vide");
		System.out.println("Attention : addresse vide");
	}
	public Personne(String insuffisant) {
		System.out.println("Pas assez d'informations pour entrer cette personne.");
	}
}
