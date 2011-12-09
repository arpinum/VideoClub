package fr.arpinum.kata.videoclub;

public class Location {

    double montant() {
        double résultat = 0;
        // détermine le montant pour chaque location
        switch (getFilm().getTypePrix()) {
        case NORMAL:
            résultat += 2;
            if (getJoursLoués() > 2)
                résultat += (getJoursLoués() - 2) * 1.5;
            break;
        case NOUVEAUTE:
            résultat += getJoursLoués() * 3;
            break;
        case ENFANTS:
            résultat += 1.5;
            if (getJoursLoués() > 3) {
                résultat += (getJoursLoués() - 3) * 1.5;
            }
            break;
        }
        return résultat;
    }

    int pointsDeFidélité() {
        int résultat = 1;
        // ajout d'un bonus pour location de deux jours d'une nouveauté
        if (getFilm().getTypePrix() == Film.TypePrix.NOUVEAUTE
                && getJoursLoués() > 1) {
            résultat += 1;
        }
        return résultat;
    }

    private Film film;
	private int joursLoués;
	
	public Location(Film film, int joursLoués) {
		this.film = film;
		this.joursLoués = joursLoués;
	}
	
	public int getJoursLoués() {
		return joursLoués;
	}
	
	public Film getFilm() {
		return film;
	}
}
