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
    
    //Setters (Non utilisés mais présents)
    
	public void setDateEmbauche(LocalDate dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	public void setService(String service) {
		if (Employe.services.contains(service)) {
			this.service = service;
		}
		else {
			System.out.println("Le service '"+service+ "' n'est pas référencé. Il faut choisir parmi :" + services.toString()+" Il faut l'ajouter");
			return;
		}
	}
	
	
	public static void addService(String service) {
		if (Employe.services.contains(service)) {
			System.out.println("Le service '"+service+ "' est déjà référencé.");
		}
		else {
			services.add(service);
		}
	}
	
	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	
	// Constructeurs
	public Employe(String prenom, String nom, String adresse) {
		super(prenom, nom, adresse);
		
		long seed = System.currentTimeMillis();
		Random rng = new Random();
		rng.setSeed(seed);
		this.salaire = rng.nextInt(20147, 120000);

		this.dateEmbauche = LocalDate.now().minusMonths(rng.nextInt(1, 120)); // date d'embauche = maintenant - (entre 1 et 120 mois)
		this.service = "Prets Livre";
		this.poste = new Poste("Expert Java");
		}
	
	
	public Employe(String prenom, String nom, String adresse, String service) {
		this(prenom, nom, adresse);
		if (Employe.services.contains(service)) {
			this.service = service;
		}
		else {
			System.out.println("Le service '"+service+ "' n'est pas référencé, il faut mettre :"+ services.toString()+" nous avons mis 'Prets Livre' par défaut");
			return;
		}
	}

	public Employe(String prenom, String nom, String adresse, String service, Poste poste) {
		this(prenom, nom, adresse, service);
		this.poste = poste;
	}
	
	
	public Employe(String prenom, String nom, String adresse, String service, Poste poste, LocalDate date) {
		this(prenom, nom, adresse, service, poste);
		this.dateEmbauche = date;
	}
	
	public Employe(String prenom, String nom) {
		this(prenom, nom,"Adresse Vide");
		this.dateEmbauche = LocalDate.now();
	}
	
	public Employe(String insuffisant) {
		super(insuffisant);		
	}
		
}