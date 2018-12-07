package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Continente;

class ContinenteTest {

	@Test
	void test() {
		Continente elContinente = new Continente("America");
		assertEquals("America", elContinente.getNombre());
		assertEquals(16, elContinente.areaCuadrada(4));
	}

}
