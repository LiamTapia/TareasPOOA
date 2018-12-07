package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Animal;

class AnimalTest {

	@Test
	void test() {
		Animal perro = new Animal("Animal", 4);
		
		assertEquals("Animal", perro.getNombre());
		assertEquals(4, perro.patas());
		assertEquals(false, perro.hayReinos(false));
	}

}
