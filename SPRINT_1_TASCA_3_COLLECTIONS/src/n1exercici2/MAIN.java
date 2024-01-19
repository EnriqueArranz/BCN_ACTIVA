package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> listaOriginal = new ArrayList<>();
		listaOriginal.add(1);
		listaOriginal.add(2);
		listaOriginal.add(3);
		listaOriginal.add(4);
		listaOriginal.add(5);

		List<Integer> listaInversa = new ArrayList<>();
		List<Integer> listaInversa2 = new ArrayList<>();
		
		
 		
        // RECORRER ARRAY CON FOR
		System.out.println("Contenido del List<Integer> (orden primario):");
		for (int numero : listaOriginal) {
			System.out.println(numero);
		}
		// RECORRER ARRAY CON FOR + INDICE
		System.out.println("Otra forma de recorrer array primario");
		for (int i = 0; i < listaOriginal.size(); i++) {
			System.out.println(listaOriginal.get(i));
		}

		System.out.println("Recorrer array al reves");
		int size = listaOriginal.size();
		for (int i = size - 1; i >= 0; i--) {
			int numero = listaOriginal.get(i);
			System.out.println("Número: " + numero);

		}

		System.out.println("Orden inverso");
		// int size = listaOriginal.size(); YA ESTAN DECLARADAS
		// int numero = listaOriginal.get(i);
		for (int i = size - 1; i >= 0; i--) {
			int numero = listaOriginal.get(i);
			listaInversa.add(numero);

		}
		System.out.println(listaInversa);

		// Usar ListIterator para leer elementos de la primera lista y agregarlos en
		// orden inverso en la segunda lista

		ListIterator<Integer> listIterator = listaOriginal.listIterator(listaOriginal.size());
		while (listIterator.hasPrevious()) {
			int elemento = listIterator.previous();
			listaInversa2.add(elemento);
		}

		// Mostrar el contenido del segundo List<Integer> (listaInversa)
		System.out.println("Contenido del segundo List<Integer> (orden inverso):");
		for (int numero : listaInversa2) {
			System.out.println(numero);
		}
	}
}
