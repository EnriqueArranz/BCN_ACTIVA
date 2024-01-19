package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producte producte1 = new Producte("platano", 5);
		Venda venda = new Venda();
		venda.afegirProducte(producte1);
		try {
			// Intentamos calcular el precio total de la venta
			venda.calcularTotal();
		} catch (VendaBuidaException e) {
			// Capturamos y mostramos la excepción personalizada
			System.out.println(e.getMessage());
		}
		try {
			// Sabemos que la clase Venda sólo tiene un producto por lo que intentamos
			// acceder
			// a una posición que no existe (la posición inicial de una array es 0)
			venda.getProductes().get(1);

		} catch (IndexOutOfBoundsException e) {
			// Capturamos y mostramos la excepción de índice fuera de rango
			System.out.println("Excepción IndexOutOfBoundsException: " + e.getMessage());
		}
	}

}
