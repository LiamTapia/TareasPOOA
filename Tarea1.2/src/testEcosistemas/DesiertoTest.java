package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Desierto;

class DesiertoTest {

	@Test
	void test() {
		Desierto elDesierto = new Desierto("Sahara");
		assertEquals("Sahara", elDesierto.getNombre());
		assertEquals(20, elDesierto.area(20));
	}

}
