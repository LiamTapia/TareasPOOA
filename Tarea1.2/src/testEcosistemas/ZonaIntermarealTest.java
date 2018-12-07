package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.ZonaIntermareal;

class ZonaIntermarealTest {

	@Test
	void test() {
		ZonaIntermareal laZIntermareal = new ZonaIntermareal("Entre mares?");
		assertEquals("Entre mares?", laZIntermareal.getNombre());
		assertEquals(80, laZIntermareal.distanciaCosta(80));
	}

}
