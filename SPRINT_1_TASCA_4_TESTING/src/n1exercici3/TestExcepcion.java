package n1exercici3;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class TestExcepcion {
	@Test
	public void testLanzarExcepcion() {
		ExcepcionEjemplo ejemplo = new ExcepcionEjemplo();

		// Verificamos que al intentar acceder a un índice fuera del array lanza la excepción ArrayIndexOutOfBoundsException
		assertThrows(ArrayIndexOutOfBoundsException.class, ejemplo::lanzarExcepcion);
	}
}
