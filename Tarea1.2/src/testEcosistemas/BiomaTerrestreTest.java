package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.BiomaTerrestre;

class BiomaTerrestreTest {

	@Test
	void test() {
		BiomaTerrestre elBiomaT = new BiomaTerrestre("Bosques");
		assertEquals("Bosques", elBiomaT.getNombre());
		assertEquals(true, elBiomaT.hayPajaros(true));
	}

}
