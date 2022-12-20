package Biblio;
import java.time.LocalDate;
import java.util.HashMap;

public class Membre extends Personne{
	private LocalDate dateInscription;
	private HashMap<String, Item> memberItems = new HashMap<String, Item>();

	//Setters
	public void addMbItem(Item item) {
    	memberItems.put(item.getReference(), item);
    }
	
	public void setDateInscription(LocalDate dateInscription) {
		this.dateInscription = dateInscription;
	}

	//Getters
    public LocalDate getDateInscription() {
        return this.dateInscription;
    }
    
    public String getItemsMb() {
        return this.memberItems.toString();
    }
    
	// Constructeurs
    
	public Membre(String prenom, String nom, String adresse, LocalDate date) {
		super(prenom, nom, adresse);
		this.dateInscription = LocalDate.now();
		this.dateInscription=date;
	}
	
	public Membre(String prenom, String nom, String adresse) {
		super(prenom, nom, adresse);
		this.dateInscription = LocalDate.now();
	}
	
	public Membre(String prenom, String nom) {
		this(prenom, nom,"Adresse Vide");
		this.dateInscription = LocalDate.now();
	}
	public Membre(String insuffisant) {
		super(insuffisant);		
	}
		
}