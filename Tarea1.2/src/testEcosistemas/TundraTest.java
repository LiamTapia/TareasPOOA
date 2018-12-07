package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Tundra;

class TundraTest {

	@Test
	void test() {
		Tundra laTundra = new Tundra("Tundra de Canada");
		assertEquals("Tundra de Canada", laTundra.getNombre());
		assertEquals("Blanco", laTundra.colorPrincipal("Blanco"));
	}

}
