package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Arroyo;

class ArroyoTest {

	@Test
	void test() {
		Arroyo elArroyo = new Arroyo("Arroyo de San Quintin");
		
		assertEquals("Arroyo de San Quintin", elArroyo.getNombre());
		assertEquals(true, elArroyo.hayAgua(true));
	}

}
