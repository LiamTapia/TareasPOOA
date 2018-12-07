package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.BiomaLentico;

class BiomaLenticoTest {

	@Test
	void test() {
		BiomaLentico elBiomaLentico = new BiomaLentico("El lago de Texcoco");
		assertEquals("El lago de Texcoco", elBiomaLentico.getNombre());
		assertEquals(false, elBiomaLentico.hayCoral(false));
	}

}
