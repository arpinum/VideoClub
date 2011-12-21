package fr.arpinum.kata.videoclub;

public class RésuméHtml extends Résumé {

	@Override
	protected String piedDePage(final Client client) {
		String résultat = "<p>Le montant dû est " + String.valueOf(client.montantTotal()) + "</p>\n";
		résultat += "<p>Vous avez gagné " + String.valueOf(client.pointsDeFidélitéTotal())
				+ " points de fidélité</p>";
		return résultat;
	}

	@Override
	protected String description(final Location location) {
		return "<p>" + location.getFilm().getTitre() + " " + String.valueOf(location.montant()) + "</p>\n";
	}

	@Override
	protected String entête(final Client client) {
		return "<h1>Liste des locations pour " + client.getNom() + "</h1>\n";
	}

}
