package fr.arpinum.kata.videoclub;

public class Film {

	public static final int ENFANTS = 2;
	public static final int NORMAL = 0;
	public static final int NOUVELLE_SORTIE = 1;
	
	private String titre;
	private int codePrix;
	
	public Film(String titre, int codePrix) {
		this.titre = titre;
		this.codePrix = codePrix;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public int getCodePrix() {
		return codePrix;
	}
	
	public void setCodePrix(int codePrix) {
		this.codePrix = codePrix;
	}
}
