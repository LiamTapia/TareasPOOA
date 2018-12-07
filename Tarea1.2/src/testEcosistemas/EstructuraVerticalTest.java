package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.EstructuraVertical;

class EstructuraVerticalTest {

	@Test
	void test() {
		EstructuraVertical laEstV = new EstructuraVertical("Estructura del cielo");
		assertEquals("Estructura del cielo", laEstV.getNombre());
		assertEquals(false, laEstV.usoEstructura(false));
	}

}
