package fr.arpinum.kata.videoclub;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.arpinum.kata.videoclub.Film.TypePrix;

public class TestsFilmHorreur {

	private Film film;

	@Before
	public void avant() {
		film = new Film("bouhhhh", TypePrix.HORREUR);
	}

	@Test
	public void peutCréerUnFilmDHorreur() {
		assertThat(film.getTypePrix(), is(TypePrix.HORREUR));
	}

	@Test
	public void unFilmDHorreurCoute3Euros() {
		assertThat(film.montant(23), is(3d));
	}

	@Test
	public void unFilmDHorreurFaitGagner4PointsDeFidélité() {
		assertThat(film.pointsDeFidélité(12), is(4));
	}
}
