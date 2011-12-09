package fr.arpinum.kata.videoclub;

public class Location {

    double montant() {
        return film.montant(getJoursLoués());
    }

    int pointsDeFidélité() {
        return film.pointsDeFidélité(getJoursLoués());
    }


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

    private Film film;
	private int joursLoués;
}
