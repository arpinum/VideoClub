package fr.arpinum.kata.videoclub;

public class Film {

    double montantPour(int joursLoués1) {
        double résultat = 0;
        switch (getTypePrix()) {
        case NORMAL:
            résultat += 2;
            if (joursLoués1 > 2)
                résultat += (joursLoués1 - 2) * 1.5;
            break;
        case NOUVEAUTE:
            résultat += joursLoués1 * 3;
            break;
        case ENFANTS:
            résultat += 1.5;
            if (joursLoués1 > 3) {
                résultat += (joursLoués1 - 3) * 1.5;
            }
            break;
        }
        return résultat;
    }

    int pointsDeFidélitésPour(int joursLoués1) {
        int résultat = 1;
        // ajout d'un bonus pour location de deux jours d'une nouveauté
        if (getTypePrix() == TypePrix.NOUVEAUTE
                && joursLoués1 > 1) {
            résultat += 1;
        }
        return résultat;
    }

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
	
	public void setCodePrix(TypePrix type) {
		this.type = type;
	}
}
