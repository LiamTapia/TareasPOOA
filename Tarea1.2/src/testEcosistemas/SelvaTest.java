package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Selva;

class SelvaTest {

	@Test
	void test() {
		Selva laSelva = new Selva("Selva Lacandona");
		assertEquals("Selva Lacandona", laSelva.getNombre());
		assertEquals(false, laSelva.hayMono(false));
	}

}
