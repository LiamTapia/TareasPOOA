package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.CambiosQuimicos;

class CambiosQuimicosTest {

	@Test
	void test() {
		CambiosQuimicos elCambioQ = new CambiosQuimicos("Cambio en los componentes del aire");
		assertEquals("Cambio en los componentes del aire", elCambioQ.getNombre());
		assertEquals(true, elCambioQ.hayCambioQuimico(true));
	}

}
