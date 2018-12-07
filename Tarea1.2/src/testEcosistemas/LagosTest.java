package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Lagos;

class LagosTest {

	@Test
	void test() {
		Lagos elLago = new Lagos("Lago Virginia");
		assertEquals("Lago Virginia", elLago.getNombre());
		assertEquals(false, elLago.hayAlgas(false));
	}

}
