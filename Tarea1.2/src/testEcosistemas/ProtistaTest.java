package testEcosistemas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Ecosistemas.Protista;

class ProtistaTest {

	@Test
	void test() {
		Protista elProto = new Protista("Plasmodium");
		assertEquals("Plasmodium", elProto.getNombre());
		assertEquals("Verde", elProto.colorP("Verde"));
	}

}
