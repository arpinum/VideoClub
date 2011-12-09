package fr.arpinum.kata.videoclub;

public class Film {

    double montant(int joursLoués) {
        double résultat = 0;
        // détermine le montant pour chaque location
        switch (getTypePrix()) {
        case NORMAL:
            résultat += 2;
            if (joursLoués > 2)
                résultat += (joursLoués - 2) * 1.5;
            break;
        case NOUVEAUTE:
            résultat += joursLoués * 3;
            break;
        case ENFANTS:
            résultat += 1.5;
            if (joursLoués > 3) {
                résultat += (joursLoués - 3) * 1.5;
            }
            break;
        }
        return résultat;
    }

    int pointsDeFidélité(int joursLoués) {
        int résultat = 1;
        // ajout d'un bonus pour location de deux jours d'une nouveauté
        if (getTypePrix() == TypePrix.NOUVEAUTE
                && joursLoués > 1) {
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
