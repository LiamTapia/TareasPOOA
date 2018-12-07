package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Reinos;

class ReinosTest {

	@Test
	void test() {
		Reinos elReino = new Reinos("Animal");
		assertEquals("Animal", elReino.getNombre());
		assertEquals(true, elReino.hayReinos(true));
	}

}
