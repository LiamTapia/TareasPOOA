package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.BiomaUArtificial;

class BiomaUArtificialTest {

	@Test
	void test() {
		BiomaUArtificial elBUA = new BiomaUArtificial("Ciudad");
		assertEquals("Ciudad", elBUA.getNombre());
		assertEquals(true, elBUA.hayCarreteras(true));
	}

}
