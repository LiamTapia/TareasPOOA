package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Mar;

class MarTest {

	@Test
	void test() {
		Mar elMar = new Mar("Mar Rojo");
		assertEquals("Mar Rojo", elMar.getNombre());
		assertEquals(900, elMar.profundidad(900));
	}

}
