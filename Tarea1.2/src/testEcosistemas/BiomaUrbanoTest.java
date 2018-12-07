package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.BiomaUrbano;

class BiomaUrbanoTest {

	@Test
	void test() {
		BiomaUrbano elBiomaUrbano = new BiomaUrbano("Tijuana");
		assertEquals("Tijuana", elBiomaUrbano.getNombre());
		assertEquals(true, elBiomaUrbano.hayEdificios(true));
	}

}
