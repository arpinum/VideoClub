package fr.arpinum.kata.videoclub;

public class Film {

	private final String titre;
	private Prix prix;

	public Film(final String titre, final TypePrix typePrix) {
		this.titre = titre;
		prix = typePrix.nouveauPrix();
	}

	public String getTitre() {
		return titre;
	}

	public TypePrix getTypePrix() {
		return prix.getTypePrix();
	}

	public void setTypePrix(final TypePrix typePrix) {
		prix = typePrix.nouveauPrix();
	}

	public double montantPour(final int joursLoués) {
		return prix.montantPour(joursLoués);
	}

	public int pointsDeFidélitéPour(final int joursLoués) {
		return prix.pointsDeFidélitéPour(joursLoués);
	}
}
