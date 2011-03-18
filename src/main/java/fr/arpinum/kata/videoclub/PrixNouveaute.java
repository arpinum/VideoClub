package fr.arpinum.kata.videoclub;


public class PrixNouveaute extends Prix{

	@Override
	public TypePrix getTypePrix() {
		return TypePrix.NOUVEAUTE;
	}
	
	@Override
	double montantPour(int joursLoués) {
		return joursLoués * 3;
	}
	
	@Override
	int pointsDeFidélitéPour(int joursLoués) {
		if (joursLoués > 1)
			return 2;
		return 1;
	}

}
