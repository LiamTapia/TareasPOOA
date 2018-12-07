package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.ZonaPelagica;

class ZonaPelagicaTest {

	@Test
	void test() {
		ZonaPelagica laZPelagica = new ZonaPelagica("Casi costa");
		assertEquals("Casi costa", laZPelagica.getNombre());
		assertEquals(90, laZPelagica.distanciaCosta(90));
	}

}
