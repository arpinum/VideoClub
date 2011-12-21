package fr.arpinum.kata.videoclub;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.arpinum.kata.videoclub.Film.TypePrix;

public class TestsClient {

	private Client client;

	@Before
	public void avant() {
		client = clientSimple();
	}

	@Test
	public void peutCréerClient() {

		assertThat(client.getNom(), is("Jb Dusseaut"));
	}

	@Test
	public void peutCalculerRésuméPourFilmNormal() {
		client.ajouteLocation(new Location(filmNormal(), 1));

		final String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n" + "\tThe social network\t2.0\n"
				+ "Le montant dû est 2.0\n" + "Vous avez gagné 1 points de fidélité"));
	}

	@Test
	public void peutCalculerRésuméPourNouveauté() {
		client.ajouteLocation(new Location(filmNouveauté(), 1));

		final String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n" + "\tThe social network\t3.0\n"
				+ "Le montant dû est 3.0\n" + "Vous avez gagné 1 points de fidélité"));
	}

	@Test
	public void peutCalculerRésuméPourFilmEnfant() {
		client.ajouteLocation(new Location(filmEnfant(), 1));

		final String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n" + "\tThe social network\t1.5\n"
				+ "Le montant dû est 1.5\n" + "Vous avez gagné 1 points de fidélité"));
	}

	@Test
	public void peutCalculerPénalitéSurFilmNormal() {
		client.ajouteLocation(new Location(filmNormal(), 3));

		final String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n" + "\tThe social network\t3.5\n"
				+ "Le montant dû est 3.5\n" + "Vous avez gagné 1 points de fidélité"));
	}

	@Test
	public void peutCalculerPénalitéSurFilmEnfant() {
		client.ajouteLocation(new Location(filmEnfant(), 4));

		final String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n" + "\tThe social network\t3.0\n"
				+ "Le montant dû est 3.0\n" + "Vous avez gagné 1 points de fidélité"));
	}

	@Test
	public void peutCalculerPointsFidélitéPourNouveauté() {
		client.ajouteLocation(new Location(filmNouveauté(), 3));

		final String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n" + "\tThe social network\t9.0\n"
				+ "Le montant dû est 9.0\n" + "Vous avez gagné 2 points de fidélité"));
	}

	@Test
	public void peutCumulerLesPointsEtLePrix() {
		client.ajouteLocation(new Location(filmNouveauté(), 1));
		client.ajouteLocation(new Location(filmNormal(), 1));

		final String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n" + "\tThe social network\t3.0\n"
				+ "\tThe social network\t2.0\n" + "Le montant dû est 5.0\n"
				+ "Vous avez gagné 2 points de fidélité"));
	}

	@Test
	public void peutObtenirRésuméHtml() {
		client.ajouteLocation(new Location(filmNouveauté(), 1));
		client.ajouteLocation(new Location(filmNormal(), 1));

		final String résumé = client.résuméHtml();

		assertThat(résumé, is("<h1>Liste des locations pour Jb Dusseaut</h1>\n" + "<p>The social network 3.0</p>\n"
				+ "<p>The social network 2.0</p>\n" + "<p>Le montant dû est 5.0</p>\n"
				+ "<p>Vous avez gagné 2 points de fidélité</p>"));
	}

	private Film filmNouveauté() {
		return film(TypePrix.NOUVEAUTE);
	}

	private Film filmEnfant() {
		return film(TypePrix.ENFANTS);
	}

	private Film filmNormal() {
		return film(TypePrix.NORMAL);
	}

	private Film film(final TypePrix typePrix) {
		return new Film("The social network", typePrix);
	}

	private Client clientSimple() {
		return new Client("Jb Dusseaut");
	}
}
