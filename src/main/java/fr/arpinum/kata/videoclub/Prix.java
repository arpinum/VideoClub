package fr.arpinum.kata.videoclub;

public abstract class Prix {

	public abstract int getCodePrix();

	abstract double montantPour(int joursLoués);

	int pointsDeFidélitéPour(int joursLoués) {
		return 1;
	}
}
