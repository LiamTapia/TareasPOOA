package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.ZonaAbisal;

class ZonaAbisalTest {

	@Test
	void test() {
		ZonaAbisal laZAbisal = new ZonaAbisal("Profundidades");
		assertEquals("Profundidades", laZAbisal.getNombre());
		assertEquals(false, laZAbisal.hayLuz(false));
	}

}
