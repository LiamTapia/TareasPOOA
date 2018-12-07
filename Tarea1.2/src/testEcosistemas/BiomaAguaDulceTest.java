package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.BiomaAguaDulce;

class BiomaAguaDulceTest {

	@Test
	void test() {
		BiomaAguaDulce elBiomaAguaD = new BiomaAguaDulce("Lago Titicaca.");
		assertEquals("Lago Titicaca.", elBiomaAguaD.getNombre());
		assertEquals(true, elBiomaAguaD.hayPeces(true));
	}

}
