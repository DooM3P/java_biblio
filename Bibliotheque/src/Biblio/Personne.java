package Biblio;

import java.util.ArrayList;

public class Personne {
	private String nom;
	private String prenom;
	private String adresse;
	
	public static ArrayList<String> personnes = new ArrayList<String>();
	//public static ArrayList<String> personnes;

	public Personne(String prenom, String nom, String adresse) {
		String idPersonnes = prenom+" "+nom;
		if (Personne.personnes.contains(idPersonnes) == true) {
			System.out.println(idPersonnes+" est déjà présent dans nos bases.");
		}
		else {
			this.nom = nom;
			this.prenom = prenom;
			this.adresse = adresse;
			Personne.personnes.add(idPersonnes);
		}
	}
	
	public Personne(String nom, String prenom) {
		this(nom,prenom,"Adresse Vide");
		System.out.println("Attention : addresse vide");
	}
	public Personne(String insuffisant) {
		System.out.println("Pas assez d'informations pour entrer cette personne.");
	}
}
