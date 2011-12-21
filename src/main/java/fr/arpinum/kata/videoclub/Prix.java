package fr.arpinum.kata.videoclub;

import fr.arpinum.kata.videoclub.Film.TypePrix;

public abstract class Prix {
	abstract TypePrix getTypePrix();

	abstract double montant(final int joursLoués);

	int pointsDeFidélité(final int joursLoués) {
		return 1;
	}
}
