package Biblio;

public class Bibliotheque {
	private String ville;
	private int capaciteVisiteurs;
	private int capaciteItems;
	
	public static String[] villes = {};
	
	public Bibliotheque(String ville) {
		boolean villeOk = true;
		for (int i = 0; i <this.villes.length;i++) {
			if (ville == this.villes[i]) {
				villeOk = false;
			}
		}
		System.out.println(villeOk);
		this.ville = ville;
		System.out.println("La ville est : "+this.ville);
		this.capaciteVisiteurs = 30 + (int)(Math.random() * (250 - 30) + 1);
		System.out.println("La Capacité de visiteur est de : "+String.valueOf(this.capaciteVisiteurs)+" par jours");
		this.capaciteItems = 1000 + (int)(Math.random() * ((150000 - 1000) + 1));
		System.out.println("La Capacité d' items est de : "+String.valueOf(this.capaciteItems)+" items");
		
	}
	
	public Bibliotheque(String ville, int capaI, int capaV) {
		this.ville = ville;
		if (capaV > 30 && capaV < 250) {
			this.capaciteVisiteurs = capaV;
		}
		else {
			this.capaciteVisiteurs = 30 + (int)(Math.random() * (250 - 30) + 1);
		}
		if (capaI > 1000 &&  capaI < 150000) {
			this.capaciteItems = capaI;
		}
		else {
			this.capaciteItems = 1000 + (int)(Math.random() * ((150000 - 1000) + 1));
		}
		System.out.println("La ville est : "+this.ville);
		System.out.println("La Capacité de visiteur est de : "+String.valueOf(this.capaciteVisiteurs)+" par jours");
		System.out.println("La Capacité d' items est de : "+String.valueOf(this.capaciteItems)+" items");
	}
	
	
	
	public int getCapaciteVisiteurs() {
        return this.capaciteVisiteurs;
    }
    
    public void setCapasiteVisiteurs(int capaV) {
    	if (capaV > 30 && capaV < 250) {
			this.capaciteVisiteurs = capaV;
		}
    }
    public int getCapaciteItems() {
        return this.capaciteItems;
    }
    
    public void setCapasiteItems(int capaI) {
    	if (capaI > 1000 && capaI < 150000) {
			this.capaciteItems = capaI;
		}
    }
	
}
