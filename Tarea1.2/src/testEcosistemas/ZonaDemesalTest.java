package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.ZonaDemesal;

class ZonaDemesalTest {

	@Test
	void test() {
		ZonaDemesal laZDemesal = new ZonaDemesal("No tan profundo");
		assertEquals("No tan profundo", laZDemesal.getNombre());
		assertEquals(100, laZDemesal.distanciaCosta(100));
	}

}
