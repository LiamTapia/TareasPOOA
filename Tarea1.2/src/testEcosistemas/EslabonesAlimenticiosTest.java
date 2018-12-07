package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.EslabonesAlimenticios;

class EslabonesAlimenticiosTest {

	@Test
	void test() {
		EslabonesAlimenticios elEslabon = new EslabonesAlimenticios("Eslabon del bosque 5");
		assertEquals("Eslabon del bosque 5", elEslabon.getNombre());
		assertEquals(15, elEslabon.cantEslabones(15));
	}

}
