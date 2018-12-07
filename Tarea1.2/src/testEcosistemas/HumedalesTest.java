package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Humedales;

class HumedalesTest {

	@Test
	void test() {
		Humedales elHumedal = new Humedales("Humedal de Europa");
		assertEquals("Humedal de Europa", elHumedal.getNombre());
		assertEquals(true, elHumedal.hayVida(true));
	}

}
