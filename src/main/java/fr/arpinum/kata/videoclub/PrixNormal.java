package fr.arpinum.kata.videoclub;

public class PrixNormal extends Prix {

	@Override
	public int getCodePrix() {
		return Film.NORMAL;
	}
	
	@Override
	double montantPour(int joursLoués) {
		double résultat = 2;
		if (joursLoués > 2)
			résultat += (joursLoués - 2) * 1.5;
		return résultat;
	}

}
