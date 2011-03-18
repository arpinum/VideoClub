package fr.arpinum.kata.videoclub;

public class Location {

	private final Film film;
	private final int joursLoués;

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

	public double montant() {
		return getFilm().montantPour(getJoursLoués());
	}

	public int pointsDeFidélités() {
		return film.pointsDeFidélitéPour(getJoursLoués());
	}
}
