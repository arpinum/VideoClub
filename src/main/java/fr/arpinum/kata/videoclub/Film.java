package fr.arpinum.kata.videoclub;

public class Film {

	public enum TypePrix {
		ENFANTS, NORMAL, NOUVEAUTE
	};
	
	private String titre;
	private TypePrix type;
	
	public Film(String titre, TypePrix type) {
		this.titre = titre;
		this.type = type;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public TypePrix getTypePrix() {
		return type;
	}
	
	public void setTypePrix(TypePrix type) {
		this.type = type;
	}
}
