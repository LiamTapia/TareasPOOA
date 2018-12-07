package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Rio;

class RioTest {

	@Test
	void test() {
		Rio elRio = new Rio("Amazonas");
		assertEquals("Amazonas", elRio.getNombre());
		assertEquals(500, elRio.distancia(500));
	}

}
