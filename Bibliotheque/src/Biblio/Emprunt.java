package Biblio;
import java.time.LocalDate;

public class Emprunt {
	private LocalDate dateEmprunt;
	private LocalDate dateRetour;
	private Item item;
	private Membre membre;
	private Bibliotheque bibliotheque;
	//private Employe employe; On ne retient pas l'employé en charge du prêt (pour simplifier et parce que ça n'est pas indispensable dans une bibliotheque publique)
	
	
	//Getters
	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public LocalDate getDateRetour() {
		return dateRetour;
	}

	public Membre getMembre() {
		return membre;
	}

	public Item getItem() {
		return item;
	}
	
	public Bibliotheque getBibliotheque() {
		return bibliotheque;
	}
	
	//Setters
	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	public void setBibliotheque(Bibliotheque bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

	//Constructeur
	public Emprunt(Bibliotheque biblio, String reference, Membre membre, LocalDate dateEmprunt, LocalDate dateRetour) {
		if ((biblio.getItemByRef(reference)!= null) && (biblio.getMemberByName(membre.getPrenom(), membre.getNom())!= null)){// on vérifie l'adhésion du membre
			this.dateEmprunt=dateEmprunt;
			this.dateRetour=dateRetour;
			this.item=biblio.getItemByRef(reference);
			this.membre = membre; // on aurait pu également implémenter un enregistrement par identifiant du membre comme pour l'item ; ici l'objet "membre est passé directement en paramètre.
			membre.addMbItem(item);
		}
	}

	public Emprunt(Bibliotheque biblio, String reference, Membre membre, LocalDate dateEmprunt) {
		System.out.println("Il manque un paramètre de date.");
	}
}
