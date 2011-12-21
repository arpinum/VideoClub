package fr.arpinum.kata.videoclub;

import fr.arpinum.kata.videoclub.Film.TypePrix;

public class PrixHorreur extends Prix {

	@Override
	TypePrix getTypePrix() {
		return TypePrix.HORREUR;
	}

	@Override
	double montant(final int joursLoués) {
		return 3;
	}

	@Override
	int pointsDeFidélité(final int joursLoués) {
		return 4;
	}

}
