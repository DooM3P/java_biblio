package Biblio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Bibliotheque {
	private String ville;
	private int capaciteVisiteurs;
	private int capaciteItems;
	private int capaciteEmploye;
	
	private HashMap<String, Item> bibliItems = new HashMap<String, Item>(); // Liste items
	private HashMap<String, Employe> bibliStaff = new HashMap<String, Employe>(); // Liste Employes
	private HashMap<String, Membre> bibliMembers = new HashMap<String, Membre>(); // Liste membres


	
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
    
    // Setters
    
    public void addItem(Item item) {
    	if (bibliItems.containsKey(item.getReference()) && bibliItems.size()<this.capaciteItems) {
    		System.out.println("Impossible d'ajouter cet Item : déjà présent");
    	}
    	else {
    		bibliItems.put(item.getReference(), item);
    	}
    }
    
    public void addStaff(Employe employe) {
    	if (bibliStaff.containsKey(employe.getIdPersonne()) && bibliStaff.size()<this.capaciteEmploye) {
    		System.out.println("Impossible d'ajouter cet Item : déjà présent");
    	}
    	else {
    		bibliStaff.put(employe.getIdPersonne(), employe);
    	}
    }    

    public void addMember(Membre membre) {
    	if (bibliMembers.containsKey(membre.getIdPersonne())&& bibliMembers.size()<this.capaciteVisiteurs) {
    		System.out.println("Impossible d'ajouter cet Item : déjà présent");
    	}
    	else {
    		bibliMembers.put(membre.getIdPersonne(), membre);
    	}
    }  
    
   
    public void setCapaciteItems(int capaI) {
    	if (capaI > 1000 && capaI < 150000) {
			this.capaciteItems = capaI;
		}
    }
    public void setCapaciteVisiteurs(int capaV) {
    	if (capaV > 30 && capaV < 250) {
			this.capaciteVisiteurs = capaV;
		}
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
			this.capaciteVisiteurs = rng.nextInt(30, 250); // On a considéré que visiteurs = membres
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
