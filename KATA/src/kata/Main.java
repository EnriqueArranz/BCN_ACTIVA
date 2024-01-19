package kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> listaOriginal = new ArrayList<>();

		listaOriginal.add(4);
		listaOriginal.add(0);
		listaOriginal.add(7);
		listaOriginal.add(0);
		listaOriginal.add(3);
		listaOriginal.add(2);
		listaOriginal.add(0);

		for (int i = 0; i < listaOriginal.size(); i++) {
			if (listaOriginal.get(i) == 0) {
				listaOriginal.remove(i);
				listaOriginal.add(0);
			} else {

			}

		}
		System.out.println(listaOriginal);

		//MISMO EJERCICIO CON LAMBDAS Y FILTRADO
		List<Integer> listaOriginal2 = new ArrayList<>();
		listaOriginal2.add(4);
		listaOriginal2.add(0);
		listaOriginal2.add(7);
		listaOriginal2.add(0);
		listaOriginal2.add(3);
		listaOriginal2.add(2);
		listaOriginal2.add(0);


		List<Integer> noCeros = listaOriginal2.stream()
				.filter(element -> element != 0)
				.collect(Collectors.toList());

		long countCeros = listaOriginal2.size() - noCeros.size();

		noCeros.addAll(Collections.nCopies((int) countCeros, 0));

		System.out.println(noCeros);

		//listaOriginal2.removeIf(element -> element == 0);
		//listaOriginal2.replaceAll(element -> element == 0 ? 0 : element);



	}
}
