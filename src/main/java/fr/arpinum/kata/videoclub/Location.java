package fr.arpinum.kata.videoclub;

public class Location {

	private Film film;
	private int joursLoués;

	public Location(final Film film, final int joursLoués) {
		this.film = film;
		this.joursLoués = joursLoués;
	}

	public int getJoursLoués() {
		return joursLoués;
	}

	public Film getFilm() {
		return film;
	}

	double montant() {
		return film.montant(getJoursLoués());
	}

	int pointsDeFidélité() {
		return film.pointsDeFidélité(getJoursLoués());
	}
}
