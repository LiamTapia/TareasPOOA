package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.CambiosFisicos;

class CambiosFisicosTest {

	@Test
	void test() {
		CambiosFisicos elCambioF = new CambiosFisicos("Erosion");
		assertEquals("Erosion", elCambioF.getNombre());
		assertEquals(true, elCambioF.hayCambio(true));
	}

}
