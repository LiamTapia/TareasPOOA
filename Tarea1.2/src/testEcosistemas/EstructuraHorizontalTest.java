package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.EstructuraHorizontal;

class EstructuraHorizontalTest {

	@Test
	void test() {
		EstructuraHorizontal laEstH = new EstructuraHorizontal("Estructura en el mar");
		assertEquals("Estructura en el mar", laEstH.getNombre());
		assertEquals(true, laEstH.usoEstructura(true));
	}

}
