package Biblio;
import java.time.LocalDate;

public class Livre extends Item {
	private String auteur;
	private LocalDate dateDeParution;
	private String  editeur;

	//Getters
	public String getAuteur() {
        return this.auteur;
    }
	public LocalDate getDateDeParution() {
        return this.dateDeParution;
    }
	public String getEditeur() {
        return this.editeur;
    }
	
	//Setters
	public void setAuteur(String auteur) {
        this.auteur=auteur;
    }
	public void setDateDeParution(LocalDate dateDeParution) {
        this.dateDeParution=dateDeParution;
    }
	public void setEditeur(String editeur) {
        this.editeur=editeur;
    }
	
	//Constructeurs
	public Livre(String titre, String reference, String auteur,LocalDate dateDeParution,String  editeur) {
		super(titre, reference);
		this.auteur=auteur;
		this.dateDeParution=dateDeParution;
		this.editeur=editeur;
	}

	public Livre(String insuffisant) {
		super(insuffisant);
	}

}
