package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Taiga;

class TaigaTest {

	@Test
	void test() {
		Taiga laTaiga = new Taiga("Taiga de Europa");
		assertEquals("Taiga de Europa", laTaiga.getNombre());
		assertEquals(80, laTaiga.alto(80));
	}

}
