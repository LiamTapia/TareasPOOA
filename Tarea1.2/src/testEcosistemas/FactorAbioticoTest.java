package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.FactorAbiotico;

class FactorAbioticoTest {

	@Test
	void test() {
		FactorAbiotico elFactorA = new FactorAbiotico("Suelos");
		assertEquals("Suelos", elFactorA.getNombre());
		assertEquals(20, elFactorA.cantFactorAbiotico(20));
	}

}
