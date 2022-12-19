package Biblio;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;
import java.util.Random;

public class Employe extends Personne{
	private LocalDate dateEmbauche;
	private int salaire;
	private String service;
	
	public static ArrayList<String> services = new ArrayList<String>(Arrays.asList("Prets Livre", "Deboguage Java", "Soutien Psychologique aux dev Java", "Informatique", "Comptabilité"));
	

	//Getters
    public LocalDate getDateEmbauche() {
        return this.dateEmbauche;
    }
    public int getSalaire() {
        return this.salaire;
    }
    
	// Constructeurs
	public Employe(String prenom, String nom, String adresse) {
		super(prenom, nom, adresse);
		this.dateEmbauche = LocalDate.now();
		long seed = System.currentTimeMillis();
		Random rng = new Random();
		rng.setSeed(seed);
		this.salaire = rng.nextInt(20147, 120000);
		this.service = "Prets Livre";
	}
	
	public Employe(String prenom, String nom, String adresse, String service) {
		super(prenom, nom, adresse);
		if (Employe.services.contains(service)) {
			this.service = service;
		}
		else {
			System.out.println("Mauvais service pour cette personne.");
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