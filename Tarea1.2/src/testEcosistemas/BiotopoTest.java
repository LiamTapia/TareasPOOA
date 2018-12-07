package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Biotopo;

class BiotopoTest {

	@Test
	void test() {
		Biotopo elBiotopo = new Biotopo("Suelos");
		assertEquals("Suelos", elBiotopo.getNombre());
		assertEquals(true, elBiotopo.sueloFertil(true));
	}

}
