package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.ConstituyenteAtmosferico;

class ConstituyenteAtmosfericoTest {

	@Test
	void test() {
		ConstituyenteAtmosferico elConstAt = new ConstituyenteAtmosferico("Impacto en el ozono");
		assertEquals("Impacto en el ozono", elConstAt.getNombre());
		assertEquals(10, elConstAt.cantConstAtmosfericos(10));
	}

}
