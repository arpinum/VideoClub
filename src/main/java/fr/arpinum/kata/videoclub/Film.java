package fr.arpinum.kata.videoclub;

public class Film {

	public enum TypePrix {
		ENFANTS, NORMAL, NOUVEAUTE
	}

	private String titre;
	private Prix prix;

	public Film(String titre, TypePrix typePrix) {
		this.titre = titre;
		 setTypePrix(typePrix);
	}

	public String getTitre() {
		return titre;
	}

	public TypePrix getTypePrix() {
		return prix.getTypePrix();
	}

	public void setTypePrix(TypePrix typePrix) {
		switch (typePrix) {
		case ENFANTS:
			prix = new PrixEnfant();
			break;
		case NORMAL :
			prix = new PrixNormal();
			break;
		case NOUVEAUTE:
			prix = new PrixNouveaute();
			break;
		}
	}

	public double montantPour(int joursLoués) {
		return prix.montantPour(joursLoués);
	}

	public int pointsDeFidélitéPour(int joursLoués) {
		return prix.pointsDeFidélitéPour(joursLoués);
	}
}
