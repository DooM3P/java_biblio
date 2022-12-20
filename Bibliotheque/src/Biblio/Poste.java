package Biblio;

public class Poste {
	
	private String intitule;
	
	
	//Getter
    public String getIntitule() {
        return this.intitule;
    }
	
    //Setter
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	// Constructeur
	public Poste(String intitule) {
		this.intitule=intitule;
	}
	
	public Poste() throws Exception {
		throw new Exception ("Attention, pas d'intitulé du poste");
	}	

}
