package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Sabana;

class SabanaTest {

	@Test
	void test() {
		Sabana laSabana = new Sabana("Africana");
		assertEquals("Africana", laSabana.getNombre());
		assertEquals(true, laSabana.hayAldea(true));
	}

}
