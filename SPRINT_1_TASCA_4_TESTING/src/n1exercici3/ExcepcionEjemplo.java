package n1exercici3;

public class ExcepcionEjemplo {
	
	
	public void lanzarExcepcion() {
		int[] arreglo = { 1, 2, 3, 4};
		// Intentamos acceder a una posicion del array que no existe
		int valor = arreglo[8];
	}
}
