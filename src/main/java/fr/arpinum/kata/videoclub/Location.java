package fr.arpinum.kata.videoclub;

public class Location {

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
