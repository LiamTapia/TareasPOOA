package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Suelos;

class SuelosTest {

	@Test
	void test() {
		Suelos elSuelo = new Suelos("Tierrita");
		assertEquals("Tierrita", elSuelo.getNombre());
		assertEquals(true, elSuelo.hayCesped(true));
	}

}
