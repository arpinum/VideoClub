package fr.arpinum.kata.videoclub;

import fr.arpinum.kata.videoclub.Film.TypePrix;

public class PrixEnfant extends Prix {

	@Override
	TypePrix getTypePrix() {
		return TypePrix.ENFANTS;
	}

	@Override
	double montant(final int joursLoués) {
		double résultat = 1.5;
		if (joursLoués > 3) {
			résultat += (joursLoués - 3) * 1.5;
		}
		return résultat;
	}

}
