package Biblio;

import java.time.LocalDate;
import java.time.Month;

public class Start2 {
	public static void main(String[] args) {
		Bibliotheque paris = new Bibliotheque("Paris");
		Bibliotheque francfort = new Bibliotheque("Francfort",160000 ,240);
		
		Employe jeanmarc = new Employe("Jean-Marc","Tudjman","65, Rue Machin","Comptabilité");
		paris.addStaff(jeanmarc);
		
		Employe jeanmichel = new Employe("Jean-Marc","Tudjman","65, Rue Machin","Prefets Livre"); //doublon volontaire + erreur service
		paris.addStaff(jeanmichel);
		
		Membre eric = new Membre("Eric", "Erico","64, Rue Truc", LocalDate.of(2012, Month.APRIL, 20));
		paris.addMember(eric);
		
		Livre bouquin = new Livre("Fondation", "1234E78", "Isaac Asimov",LocalDate.of(2014, Month.JANUARY, 1),"Folio SF");
		paris.addItem(bouquin);
		
		Disque pinkfloyd = new Disque("The Dark Side of the Moon", "FLOYD42","Pink Floyd", LocalDate.of(1973, Month.MARCH, 1));
		paris.addItem(pinkfloyd);
		
		System.out.println("Recap pour debug : " +paris.getItems()+" "+ paris.getMember()+" "+paris.getStaff());
		System.out.println(paris.getCapaciteItems()+" "+paris.getCapaciteVisiteurs());
		
		Emprunt pinkfloyderic = new Emprunt(paris,"FLOYD42",eric, LocalDate.of(2015, Month.JANUARY, 1), LocalDate.of(2022, Month.JANUARY, 1)); // PLUS de passages en REf
		
		System.out.println(eric.getItemsMb()); // Plus de getters et setters
	}
}
