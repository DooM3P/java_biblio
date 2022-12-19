package Biblio;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Month;

public class Start {


	public static void main(String[] args) {
		Membre Jeanmarc = new Membre("Jean-Marc","Tordjman", "65, Rue Machin");
		try {Membre Jeanmarc2 = new Membre("Jean-Marc","Tordjman", "65, Rue Machin"); //OK pas de doublons possibles
		} catch (IllegalArgumentException e) {

			}
		System.out.println(Jeanmarc.getDateInscription());
		System.out.println(Jeanmarc.getNom()+" "+Jeanmarc.getPrenom()+" "+Jeanmarc.getAdresse() );
		
		//Employe Jeanmarc3 = new Employe("Jean-Marc","Dupont");
		//Membre Jeanmarc4 = new Membre("Jean-Marc"); OK
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		//System.out.println(formatter.format(Jeanmarc3.getDateEmbauche())); OK
		//Employe Jeanmarc5 = new Employe("Jean-Marc","Tordjman");
		//System.out.println(Jeanmarc5.getSalaire());
		//Employe Jeanmarc6 = new Employe("Jean-Marc","Tordjman","65, Rue Machin","Pignolage"); Ok service vérifié
		
		System.out.println("Employé :");
		Employe Jeanmarc6 = new Employe("Jean-Marc","Tudjman","65, Rue Machin","Pretfs Livre");
		System.out.println(Jeanmarc6.getSalaire()+" "+Jeanmarc6.getService()+" "+Jeanmarc6.getIntitulePoste() +" "+ Jeanmarc6.getDateEmbauche());
		
		System.out.println("Livre :");
		Livre bouquin = new Livre("Fondationx", "1234E78", "Isaac Asimov",LocalDate.of(2014, Month.JANUARY, 1),"Folio SF");
		System.out.println(bouquin.getTitre()+" "+bouquin.getReference()+" "+bouquin.getAuteur()+" "+bouquin.getEditeur()+" "+formatter.format(bouquin.getDateDeParution()) );
		bouquin.setDateDeParution(LocalDate.of(1957, Month.MARCH, 1));
		bouquin.setTitre("Fondation");
		System.out.println("Changements  : " + bouquin.getTitre()+" "+bouquin.getReference()+" "+bouquin.getAuteur()+" "+bouquin.getEditeur()+" "+formatter.format(bouquin.getDateDeParution()) );
		
		}
}
