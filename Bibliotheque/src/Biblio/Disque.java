package Biblio;

import java.time.LocalDate;

public class Disque extends Item {
	private String interprete;
	private LocalDate dateDeSortie;

	//Getter
	public String getInterprete() {
        return this.interprete;
    }
	public LocalDate getDateDeSortie() {
        return this.dateDeSortie;
    }

	//Setters
	public void setAuteur(String interprete) {
        this.interprete=interprete;
    }
	public void setDateDeSortie(LocalDate DateDeSortie) {
        this.dateDeSortie=DateDeSortie;
    }

	
	//Constructeurs
	public Disque(String titre, String reference,String interprete,LocalDate dateDeSortie) {
		super(titre, reference);
		this.interprete=interprete;
		this.dateDeSortie=dateDeSortie;
	}

	public Disque(String insuffisant) {
		super(insuffisant);
	}

}
