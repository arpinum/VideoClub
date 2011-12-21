package fr.arpinum.kata.videoclub;

public class RésuméTexte extends Résumé {

	@Override
	protected String piedDePage(final Client client) {
		String résultat = "Le montant dû est " + String.valueOf(client.montantTotal()) + "\n";
		résultat += "Vous avez gagné " + String.valueOf(client.pointsDeFidélitéTotal()) + " points de fidélité";
		return résultat;
	}

	@Override
	protected String description(final Location location) {
		return "\t" + location.getFilm().getTitre() + "\t" + String.valueOf(location.montant()) + "\n";
	}

	@Override
	protected String entête(final Client client) {
		return "Liste des locations pour " + client.getNom() + "\n";
	}

}
