package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.BiomaLotico;

class BiomaLoticoTest {

	@Test
	void test() {
		BiomaLotico elBiomaLotico = new BiomaLotico("Chapultepec");
		assertEquals("Chapultepec", elBiomaLotico.getNombre());
		assertEquals(false, elBiomaLotico.hayCoral(false));
	}

}
