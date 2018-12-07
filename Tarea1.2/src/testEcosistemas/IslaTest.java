package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Isla;

class IslaTest {

	@Test
	void test() {
		Isla laIsla = new Isla("Hawaii");
		assertEquals("Hawaii", laIsla.getNombre());
		assertEquals(20, laIsla.area(5, 4));
	}

}
