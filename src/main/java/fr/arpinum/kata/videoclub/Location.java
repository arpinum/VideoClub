package fr.arpinum.kata.videoclub;

public class Location {

    double montant() {
        return film.montantPour(getJoursLoués());
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

    int pointsDeFidélité() {
        return film.pointsDeFidélitésPour(getJoursLoués());
    }

    private Film film;
    private int joursLoués;
}
