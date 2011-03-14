package fr.arpinum.kata.videoclub;

import java.util.List;

import com.google.common.collect.Lists;

public class Client {

	private String nom;
	private List<Location> locations = Lists.newArrayList();

	public Client(String nom) {
		this.nom = nom;
	}

	public void ajouteLocation(Location location) {
		locations.add(location);
	}

	public String getNom() {
		return nom;
	}

	public String résumé() {
		String résultat = "Liste des locations pour " + getNom() + "\n";
		for (Location location : locations) {
			résultat += "\t" + location.getFilm().getTitre() + "\t"
					+ String.valueOf(location.montant()) + "\n";
		}
		résultat += "Le montant dû est " + String.valueOf(montantTotal()) + "\n";
		résultat += "Vous avez gagné "
				+ String.valueOf(pointsDeFidélité())
				+ " points de fidélité";
		return résultat;
	}
	
	public String résuméEnHtml() {
		String résultat = "<h1>Liste des locations pour <span>" + getNom() + "</span></h1>\n";
		for (Location location : locations) {
			résultat += "<p>" + location.getFilm().getTitre() + " "
					+ String.valueOf(location.montant()) + "</p>\n";
		}
		résultat += "<p>Le montant dû est " + String.valueOf(montantTotal()) + "</p>\n";
		résultat += "<p>Vous avez gagné "
				+ String.valueOf(pointsDeFidélité())
				+ " points de fidélité</p>";
		return résultat;
	}

	private int pointsDeFidélité() {
		int pointsDeFidélités = 0;
		for (Location location : locations) {
			pointsDeFidélités+=location.pointsDeFidélités();
		}
		return pointsDeFidélités;
	}

	private double montantTotal() {
		double montantTotal = 0;
		for (Location location : locations) {
			montantTotal += location.montant();
		}
		return montantTotal;
	}

}
