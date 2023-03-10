package Biblio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Bibliotheque {
	private String ville;		// Ville
	private int capaciteVisiteurs; // Capacité de la bibliot en visiteurs (et pas membres)
	private int capaciteItems;	// Capacité de la bibliot en items 
	private int capaciteEmploye;// Capacité de la bibliot en employe 
	
	private HashMap<String, Item> bibliItems = new HashMap<String, Item>(); // Liste items => Clé en string (reference de l'item) qui pointe vers l'objet
	private HashMap<String, Employe> bibliStaff = new HashMap<String, Employe>(); // Liste Employes ; clé : idPersonnes (cf. plus bas)
	private HashMap<String, Membre> bibliMembers = new HashMap<String, Membre>(); // Liste membres ; clé : idPersonnes (cf. plus bas)


	
	public static ArrayList<String> villes = new ArrayList<String>(); // Liste des Villes ayant une biblio
	
	// Getters
	
	public Item getItemByRef(String reference) {
		return bibliItems.get(reference);
	}
	
	public Membre getMemberByName(String prenom, String nom) {
		return bibliMembers.get(prenom+" "+nom);
	}
	
	public String getItems() {
		return this.bibliItems.toString();
	}
	
	public String getStaff() {
		return this.bibliStaff.toString();
	}
	
	public String getMember() {
		return this.bibliMembers.toString();
	}
	
	public int getCapaciteVisiteurs() {
        return this.capaciteVisiteurs;
    }
 
    public int getCapaciteItems() {
        return this.capaciteItems;
    }
    
	public String getVille() {
		return ville;
	}

	public int getCapaciteEmploye() {
		return capaciteEmploye;
	}

	public static ArrayList<String> getVilles() {
		return villes;
	}
	
    // Setters
    
    public void addItem(Item item) {				//Ajoute un Item à la bibliothèque
    	if (bibliItems.containsKey(item.getReference()) && bibliItems.size()<this.capaciteItems) {
    		System.out.println("Impossible d'ajouter cet Item : déjà présent");
    	}
    	else {
    		bibliItems.put(item.getReference(), item);
    	}
    }
    
    public void removeItem(Item item) {// Enlève un item ; on aurait pu également l'implémenter en reference
    	if (bibliItems.containsKey(item.getReference())) {
    		bibliItems.remove(item.getReference());
    	}
    	else {
    		return;
    	}
    }
    
    public void addStaff(Employe employe) {		//Affecte un employe à la bibliothèque
    	if (bibliStaff.containsKey(employe.getIdPersonne()) && bibliStaff.size()<this.capaciteEmploye) {
    		System.out.println("Impossible d'ajouter cet Item : déjà présent ou capacité d'item dépassée.");
    	}
    	else {
    		bibliStaff.put(employe.getIdPersonne(), employe);
    	}
    }  
    
    public void removeStaff(String prenom, String nom) {	//Enlève un employe à la bibliothèque
    	String idPersonnes = prenom+" "+nom;
    	if (bibliStaff.containsKey(idPersonnes)) {
    		bibliStaff.remove(idPersonnes);
    	}
    	else {
    		return;
    	}
    }

    public void addMember(Membre membre) {			//Ajoute un membre à la bibliothèque
    	if (bibliMembers.containsKey(membre.getIdPersonne())) {
    		System.out.println("Impossible d'ajouter cette personne : déjà présent");
    	}
    	else {
    		bibliMembers.put(membre.getIdPersonne(), membre);
    	}
    }  
    
    public void removeMember(String prenom, String nom) {	//Enlève un membre à la bibliothèque
    	String idPersonnes = prenom+" "+nom;
    	if (bibliMembers.containsKey(idPersonnes)) {
    		bibliMembers.remove(idPersonnes);
    	}
    	else {
    		return;
    	}
    }
       
    public void setCapaciteItems(int capaItems) {
    	if (capaItems > 1000 && capaItems < 150000) {
			this.capaciteItems = capaItems;
		}
    }
    
    public void setCapaciteVisiteurs(int capaVisiteurs) {
    	if (capaVisiteurs > 30 && capaVisiteurs < 250) {
			this.capaciteVisiteurs = capaVisiteurs;
		}
    }
	
	public void setVille(String ville) {
		if (villes.contains(ville)) {
			System.out.println("La ville de "+ville+" est déjà enregistrée.");
			return;
		}
		else {
		this.ville = ville;
		}
	}

	public void setCapaciteEmploye(int capaciteEmploye) {
		this.capaciteEmploye = capaciteEmploye;
	}
	
	// Constructeurs
	public Bibliotheque(String ville) {
		if (villes.contains(ville)) {
			System.out.println("La ville de "+ville+" est déjà enregistrée.");
			return;
		}
		else {
			this.ville = ville;
			long seed = System.currentTimeMillis();
			Random rng = new Random();
			rng.setSeed(seed);
			this.capaciteVisiteurs = rng.nextInt(30, 250); // Initialisation aléatoire des capacités 
			this.capaciteItems = rng.nextInt(1000, 150000);
		}
	}
	
	public Bibliotheque(String ville, int capaItems, int capaVisiteurs) {
		this(ville);
		if (capaVisiteurs > 30 && capaVisiteurs < 250) {
			this.capaciteVisiteurs = capaVisiteurs;
		}
		else {
			System.out.println("Nous avons retenu une capacité visiteurs aléatoire pour "+ville+" car l'entrée ne respecte pas l'énoncé.");
		}
		if (capaItems > 1000 &&  capaItems < 150000) {
			this.capaciteItems = capaItems;
		}
		else {
			System.out.println("Nous avons retenu une capacité item aléatoire pour "+ville+" car l'entrée ne respecte pas l'énoncé.");
		}
	}
	
}
