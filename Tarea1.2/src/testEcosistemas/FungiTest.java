package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Fungi;

class FungiTest {

	@Test
	void test() {
		Fungi elFungi = new Fungi("Hongo alucinogeno");
		assertEquals("Hongo alucinogeno", elFungi.getNombre());
		assertEquals(false, elFungi.esMortal(false));
	}

}
