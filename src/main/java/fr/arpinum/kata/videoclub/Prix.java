package fr.arpinum.kata.videoclub;

import fr.arpinum.kata.videoclub.Film.TypePrix;

public abstract class Prix {

	public abstract TypePrix getTypePrix();

	abstract double montantPour(int joursLoués);

	int pointsDeFidélitéPour(int joursLoués) {
		return 1;
	}
}
