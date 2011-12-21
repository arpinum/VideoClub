package fr.arpinum.kata.videoclub;

import fr.arpinum.kata.videoclub.Film.TypePrix;

public class PrixNouveauté extends Prix {

	@Override
	TypePrix getTypePrix() {
		return TypePrix.NOUVEAUTE;
	}

	@Override
	double montant(final int joursLoués) {
		return joursLoués * 3;
	}

	@Override
	int pointsDeFidélité(final int joursLoués) {
		return (joursLoués > 1) ? 2 : 1;
	}

}
