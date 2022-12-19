package Biblio;
import java.time.LocalDate;

public class Membre extends Personne{
	private LocalDate dateInscription;

	//Getters
    public LocalDate getDateInscription() {
        return this.dateInscription;
    }
    
	// Constructeurs
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