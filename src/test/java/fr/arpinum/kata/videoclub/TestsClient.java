package fr.arpinum.kata.videoclub;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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

		String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n"
				+ "\tThe social network\t2.0\n" + "Le montant dû est 2.0\n"
				+ "Vous avez gagné 1 points de fidélité"));
	}

	@Test
	public void peutCalculerRésuméPourNouveauté() {
		client.ajouteLocation(new Location(filmNouveauté(), 1));

		String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n"
				+ "\tThe social network\t3.0\n" + "Le montant dû est 3.0\n"
				+ "Vous avez gagné 1 points de fidélité"));
	}

	@Test
	public void peutCalculerRésuméPourFilmeEnfant() {
		client.ajouteLocation(new Location(filmEnfant(), 1));

		String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n"
				+ "\tThe social network\t1.5\n" + "Le montant dû est 1.5\n"
				+ "Vous avez gagné 1 points de fidélité"));
	}

	@Test
	public void peutCalculerPénalitéSurFilmNormal() {
		client.ajouteLocation(new Location(filmNormal(), 3));

		String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n"
				+ "\tThe social network\t3.5\n" + "Le montant dû est 3.5\n"
				+ "Vous avez gagné 1 points de fidélité"));
	}

	@Test
	public void peutCalculerPénalitéSurFilmEnfant() {
		client.ajouteLocation(new Location(filmEnfant(), 4));

		String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n"
				+ "\tThe social network\t3.0\n" + "Le montant dû est 3.0\n"
				+ "Vous avez gagné 1 points de fidélité"));
	}

	@Test
	public void peutCalculerPointsFidélitéPourNouveauté() {
		client.ajouteLocation(new Location(filmNouveauté(), 3));

		String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n"
				+ "\tThe social network\t9.0\n" + "Le montant dû est 9.0\n"
				+ "Vous avez gagné 2 points de fidélité"));
	}
	
	@Test
	public void peutCumulerLesPointsEtLePrix() {
		client.ajouteLocation(new Location(filmNouveauté(), 1));
		client.ajouteLocation(new Location(filmNormal(), 1));

		String résumé = client.résumé();

		assertThat(résumé, is("Liste des locations pour Jb Dusseaut\n"
				+ "\tThe social network\t3.0\n" 
				+ "\tThe social network\t2.0\n" 
				+ "Le montant dû est 5.0\n"
				+ "Vous avez gagné 2 points de fidélité"));
	}

	private Film filmNouveauté() {
		return film(Film.NOUVEAUTE);
	}

	private Film filmEnfant() {
		return film(Film.ENFANTS);
	}

	private Film filmNormal() {
		return film(Film.NORMAL);
	}

	private Film film(int type) {
		return new Film("The social network", type);
	}

	private Client clientSimple() {
		Client client = new Client("Jb Dusseaut");
		return client;
	}
}
