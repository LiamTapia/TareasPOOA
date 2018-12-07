package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Fenomenos;

class FenomenosTest {

	@Test
	void test() {
		Fenomenos elFenomeno = new Fenomenos("Huracan");
		assertEquals("Huracan", elFenomeno.getNombre());
		assertEquals(2, elFenomeno.cantFenomenos(2));
	}
}
