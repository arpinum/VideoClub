package fr.arpinum.kata.videoclub;

public class Film {

	public static final int ENFANTS = 2;
	public static final int NORMAL = 0;
	public static final int NOUVEAUTE = 1;

	private String titre;
	private Prix prix;

	public Film(String titre, int codePrix) {
		this.titre = titre;
		 setCodePrix(codePrix);
	}

	public String getTitre() {
		return titre;
	}

	public int getCodePrix() {
		return prix.getCodePrix();
	}

	public void setCodePrix(int codePrix) {
		switch (codePrix) {
		case Film.ENFANTS:
			prix = new PrixEnfant();
			break;
		case Film.NORMAL :
			prix = new PrixNormal();
			break;
		case Film.NOUVEAUTE:
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
