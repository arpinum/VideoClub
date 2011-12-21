package fr.arpinum.kata.videoclub;

import java.util.List;

import com.google.common.collect.Lists;

public class Client {

	private String nom;
	List<Location> locations = Lists.newArrayList();

	public Client(final String nom) {
		this.nom = nom;
	}

	public void ajouteLocation(final Location location) {
		locations.add(location);
	}

	public String getNom() {
		return nom;
	}

	public String résumé() {
		return new RésuméTexte().résumé(this);
	}

	public String résuméHtml() {
		return new RésuméHtml().résumé(this);
	}

	int pointsDeFidélitéTotal() {
		int pointsDeFidélités = 0;
		for (final Location location : locations) {
			pointsDeFidélités += location.pointsDeFidélité();
		}
		return pointsDeFidélités;
	}

	double montantTotal() {
		double montantTotal = 0;
		for (final Location location : locations) {
			montantTotal += location.montant();
		}
		return montantTotal;
	}

}
