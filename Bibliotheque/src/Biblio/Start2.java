package Biblio;

import java.time.LocalDate;


public class Start2 {
	public static void main(String[] args) throws Exception {
		
		// Création de Bibliotheques
		Bibliotheque paris = new Bibliotheque("Paris");
		
		System.out.println("Test de l'initialisation de biblio avec capacité incorrecte : ");
		Bibliotheque francfort = new Bibliotheque("Francfort",160000 ,240);
		System.out.println("capacité item de Francfort : "+ francfort.getCapaciteItems());
		
		// Création d'Employes et affectation à une (ouplusieurs) biblio
		System.out.println("---------------------------");
		System.out.println("Initialisation des employés : ");
		
		Employe jeanmarc = new Employe("Jean-Marc","Tudjman","65, Rue Machin","Comptabilité");
		paris.addStaff(jeanmarc);
		francfort.addStaff(jeanmarc);
		francfort.removeStaff("Jean-Marc","Tudjman");
		System.out.println("removeStaff fonctionne : "+ francfort.getStaff()); // ..et un salarié peut travailler dans deux bibliothèques
		
		
		Employe jeanmichel = new Employe("Jean-Marc","Tudjman","65, Rue Machin","Comptabilité"); //doublon volontaire + erreur service
		paris.addStaff(jeanmichel);
		
		Poste expert = new Poste("Expert Java");
		//Poste errone = new Poste(); // Test des exceptions : envoie bien une exception
		
		Employe edouard = new Employe("Edouard", "Vaillant","64, Rue des carambar", "Prefets Livre", expert);
		paris.addStaff(edouard);
		System.out.println("Test de l'intitulé de poste : "+ edouard.getIntitulePoste());
		
		System.out.println("---------------------------");
		System.out.println("Test ajout d'un service : ");
		Employe.addService("Service formation AFPA");
		Employe formateur = new Employe("Messi", "Mbappe", "2, rue du Qatar", "Service formation AFPA") ;
		paris.addStaff(formateur);
		System.out.println("Service du nouvel employé : " + formateur.getService());
		
		// Membres
		Membre eric = new Membre("Eric", "Erico","64, Rue Truc", LocalDate.of(2012, 4, 20));
		paris.addMember(eric);
		
		// Items
		Livre bouquin = new Livre("Fondation", "1234E78", "Isaac Asimov",LocalDate.of(1957, 1, 1),"Folio SF");
		paris.addItem(bouquin);
		
		Livre bouquin2 = new Livre("Refondation", "4321E85", "Gerard Asimov",LocalDate.of(1989, 7, 25),"Folio SF");
		paris.addItem(bouquin2);
		
		Disque pinkfloyd = new Disque("The Dark Side of the Moon", "FLOYD42","Pink Floyd", LocalDate.of(1973, 3, 1));
		paris.addItem(pinkfloyd);
		
		// Recapitulatif
		System.out.println("---------------------------");
		System.out.println("Recap pour debug de la biblio ; Items : " +paris.getItems()+", Membres : "+ paris.getMember()+", Staff : "+paris.getStaff()+ ""
				+paris.getCapaciteItems()+" "+paris.getCapaciteVisiteurs());
		
		Emprunt pinkfloyderic = new Emprunt(paris,"FLOYD42",eric, LocalDate.of(2015, 1, 1), LocalDate.of(2022, 1, 1)); 
		
		System.out.println("Items empruntés par Eric : "+ eric.getItemsMb()); 
	}
}
