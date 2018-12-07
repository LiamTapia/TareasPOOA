package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Pradera;

class PraderaTest {

	@Test
	void test() {
		Pradera laPradera = new Pradera("Pradera Suiza");
		assertEquals("Pradera Suiza", laPradera.getNombre());
		assertEquals(20, laPradera.cantAnimales(20));
	}

}
