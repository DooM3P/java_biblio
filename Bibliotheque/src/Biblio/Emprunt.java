package Biblio;
import java.time.LocalDate;

public class Emprunt {
	private LocalDate dateEmprunt;
	private LocalDate dateRetour;
	private Item item;
	private Membre membre;
	//private Employe employe; On ne retient pas l'employé en charge du prêt (pour simplifier et parce que ça n'est pas indispensable dans une bibliotheque publique)
	

	public Emprunt(Bibliotheque biblio, String reference, Membre membre, LocalDate dateEmprunt, LocalDate dateRetour) {
		if ((biblio.getItemByRef(reference)!= null) && (biblio.getMemberByName(membre.getPrenom(), membre.getNom())!= null)){// on vérifie l'adhésion du membre
			this.dateEmprunt=dateEmprunt;
			this.dateRetour=dateRetour;
			this.item=biblio.getItemByRef(reference);
			this.membre = membre; // on aurait pu également implémenter un enregistrement par identifiant du membre comme pour l'item ; ici l'objet "membre est passé directement en paramètre.
			membre.addMbItem(item);
		}
	}

}
