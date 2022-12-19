package Biblio;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.Random;

public class Employe extends Personne{
	private LocalDate dateEmbauche;
	private int salaire;
	private String service;
	private Poste poste;
	
	public static ArrayList<String> services = new ArrayList<String>(Arrays.asList("Prets Livre", "Deboguage Java", "Soutien Psychologique aux dev Java", "Informatique", "Comptabilité"));
	public static int nombreDEmployes= 0;

	//Getters
    public LocalDate getDateEmbauche() {
        return this.dateEmbauche;
    }
    public int getSalaire() {
        return this.salaire;
    }
    
    public String getService() {
        return this.service;
    }
    public String getIntitulePoste() {
        return this.poste.getIntitule();
    }
    
	// Constructeurs
	public Employe(String prenom, String nom, String adresse) {
		super(prenom, nom, adresse);
		if (Employe.nombreDEmployes < 100) {
			Employe.nombreDEmployes +=1;
			this.dateEmbauche = LocalDate.now();
			
			long seed = System.currentTimeMillis();
			Random rng = new Random();
			rng.setSeed(seed);
			this.salaire = rng.nextInt(20147, 120000);
			
			this.service = "Prets Livre";
			this.poste = new Poste("Expert Java");
		}
		else {
			System.out.println("Il y a déjà trop d'employés");
		}

	}
	
	public Employe(String prenom, String nom, String adresse, String service) {
		this(prenom, nom, adresse);
		if (Employe.services.contains(service)) {
			this.service = service;
		}
		else {
			System.out.println("Mauvais service pour cette personne.");
			return;
		}
		
		
	}
	public Employe(String prenom, String nom) {
		this(prenom, nom,"Adresse Vide");
		this.dateEmbauche = LocalDate.now();
	}
	public Employe(String insuffisant) {
		super(insuffisant);		
	}
		
}