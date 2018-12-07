package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Procarionte;

class ProcarionteTest {

	@Test
	void test() {
		Procarionte elProca = new Procarionte("Celula");
		assertEquals("Celula", elProca.getNombre());
		assertEquals(1, elProca.tamano(1));
	}

}
