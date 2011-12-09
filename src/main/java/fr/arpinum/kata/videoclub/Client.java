package fr.arpinum.kata.videoclub;

import java.util.List;

import com.google.common.collect.Lists;

import fr.arpinum.kata.videoclub.Film.TypePrix;

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
		double montantTotal = 0;
		int pointsDeFidélités = 0;
		String résultat = "Liste des locations pour " + getNom() + "\n";
		for (Location location : locations) {
			double montantCourant = 0;

			// détermine le montant pour chaque location
			switch (location.getFilm().getTypePrix()) {
			case NORMAL:
				montantCourant += 2;
				if (location.getJoursLoués() > 2)
					montantCourant += (location.getJoursLoués() - 2) * 1.5;
				break;
			case NOUVEAUTE:
				montantCourant += location.getJoursLoués() * 3;
				break;
			case ENFANTS:
				montantCourant += 1.5;
				if (location.getJoursLoués() > 3) {
					montantCourant += (location.getJoursLoués() - 3) * 1.5;
				}
				break;
			}

			// ajout des points de fidélités
			pointsDeFidélités++;
			// ajout d'un bonus pour location de deux jours d'une nouveauté
			if (location.getFilm().getTypePrix() == TypePrix.NOUVEAUTE
					&& location.getJoursLoués() > 1)
				pointsDeFidélités++;
			
			// montre le résultat pour cette location
			résultat += "\t" + location.getFilm().getTitre() + "\t" + 
				String.valueOf(montantCourant) + "\n";
			montantTotal += montantCourant;
		}
		// ajout des lignes de footer
		résultat += "Le montant dû est " + String.valueOf(montantTotal) + "\n";
		résultat += "Vous avez gagné " + String.valueOf(pointsDeFidélités) + " points de fidélité";
		return résultat;
	}
}
