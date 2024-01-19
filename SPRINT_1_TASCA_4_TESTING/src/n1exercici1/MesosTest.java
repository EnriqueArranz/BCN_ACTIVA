package n1exercici1;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class MesosTest {

	@Test
	public void provaLlistaSize() {
		Mesos mesos = new Mesos();
		List<String> llistaMesos = mesos.getLlistaMesos();

		// Verifiquem que la llista té 12 posicions
		assertEquals(12, llistaMesos.size());
	}
	@Test
	public void provaLlistaNotEmpty() {
		Mesos mesos = new Mesos();
		List<String> llistaMesos = mesos.getLlistaMesos();

		// Verifiquem que la llista no és nul·la
		assertNotNull(llistaMesos);

	}
	@Test
	public void provaLlistaCorrectPosition() {
		Mesos mesos = new Mesos();
		List<String> llistaMesos = mesos.getLlistaMesos();

		// Verifiquem que en la posició 7 conté el nom 'agost'(comença a partir del 0)
		assertEquals("agost", llistaMesos.get(7));
	}

}