package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.BiomaMarino;

class BiomaMarinoTest {

	@Test
	void test() {
		BiomaMarino elBiomaM = new BiomaMarino("Mar de Cortez");
		assertEquals("Mar de Cortez", elBiomaM.getNombre());
		assertEquals(true, elBiomaM.hayAnimales(true));
	}

}
