package Biblio;

import java.util.ArrayList;

public abstract class Item {
	private String titre;
	private String reference;
	public static ArrayList<String> items = new ArrayList<String>();
	
	//Getters	
    public String getTitre() {
        return this.titre;
    }
    public String getReference() {
        return this.reference;
    }
    

	//Setters
	public void setTitre(String titre) {
        this.titre=titre;
    }
	public void setReference(String reference) {
        this.reference=reference;
    }

	
	//Constructor
	
	public Item(String titre, String reference) {
		if (Item.items.contains(reference) == true) {
			System.out.println(titre +" (" +reference+") est déjà référencé dans nos bases.");
			throw new IllegalArgumentException();
		}
		else {
			this.titre=titre;
			this.reference=reference;
			Item.items.add(reference);
		}
	}
		
	
	public Item(String insuffisant) {
		System.out.println("Pas assez d'informations pour entrer cet item.");
	}

}
