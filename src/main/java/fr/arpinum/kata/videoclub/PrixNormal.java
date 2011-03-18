package fr.arpinum.kata.videoclub;


public class PrixNormal extends Prix {

	@Override
	public TypePrix getTypePrix() {
		return TypePrix.NORMAL;
	}
	
	@Override
	double montantPour(int joursLoués) {
		double résultat = 2;
		if (joursLoués > 2)
			résultat += (joursLoués - 2) * 1.5;
		return résultat;
	}

}
