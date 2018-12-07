package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Estanques;

class EstanquesTest {

	@Test
	void test() {
		Estanques elEstanque = new Estanques("Estanque de mi casa");
		assertEquals("Estanque de mi casa", elEstanque.getNombre());
		assertEquals(false, elEstanque.hayVida(false));
	}

}
