package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Bosque;

class BosqueTest {

	@Test
	void test() {
		Bosque elBosque = new Bosque("Bosque de Chapultepec");
		assertEquals("Bosque de Chapultepec", elBosque.getNombre());
		assertEquals(true, elBosque.haylluvia(true));
	}

}
