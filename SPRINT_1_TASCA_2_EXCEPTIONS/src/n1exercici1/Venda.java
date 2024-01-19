package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<Producte> productes;
	private double preuTotal;

	public Venda() {
		this.productes = new ArrayList<>();
		this.preuTotal = 0;
	}

	// Método para añadir productos a la venta

	public List<Producte> getProductes() {
		return productes;
	}

	public void afegirProducte(Producte producte) {
        productes.add(producte);
    }

	// Método para calcular el precio total de la venta

	public void calcularTotal() throws VendaBuidaException {
		if (productes.isEmpty()) {
			throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
		} else {
			for (Producte producte : productes) {
				preuTotal += producte.getPreu();
			}
			System.out.println("Preu total de la venda: " + preuTotal);
		}
	}
}
