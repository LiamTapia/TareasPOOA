package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.BiomaUSemiArtificial;

class BiomaUSemiArtificialTest {

	@Test
	void test() {
		BiomaUSemiArtificial elBUSA = new BiomaUSemiArtificial("Aldea");
		assertEquals("Aldea", elBUSA.getNombre());
		assertEquals(false, elBUSA.hayCarros(false));
	}

}
