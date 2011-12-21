package fr.arpinum.kata.videoclub;

public abstract class Résumé {

	public String résumé(final Client client) {
		String résultat = entête(client);
		for (final Location location : client.locations) {
			résultat += description(location);
		}
		résultat += piedDePage(client);
		return résultat;
	}

	protected abstract String entête(final Client client);

	protected abstract String description(final Location location);

	protected abstract String piedDePage(final Client client);
}
