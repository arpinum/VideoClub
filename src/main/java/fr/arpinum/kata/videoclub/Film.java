package fr.arpinum.kata.videoclub;

public class Film {

	public enum TypePrix {
		ENFANTS, NORMAL, NOUVEAUTE, HORREUR
	};

	private String titre;
	private Prix prix;

	public Film(final String titre, final TypePrix type) {
		this.titre = titre;
		setTypePrix(type);
	}

	public String getTitre() {
		return titre;
	}

	public TypePrix getTypePrix() {
		return prix.getTypePrix();
	}

	public void setTypePrix(final TypePrix type) {
		switch (type) {
		case ENFANTS:
			prix = new PrixEnfant();
			break;
		case NOUVEAUTE:
			prix = new PrixNouveauté();
			break;
		case NORMAL:
			prix = new PrixNormal();
			break;
		case HORREUR:
			prix = new PrixHorreur();
			break;
		default:
			break;
		}
	}

	double montant(final int joursLoués) {
		return prix.montant(joursLoués);
	}

	int pointsDeFidélité(final int joursLoués) {
		return prix.pointsDeFidélité(joursLoués);
	}
}
