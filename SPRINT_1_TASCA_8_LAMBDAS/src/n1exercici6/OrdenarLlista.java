package n1exercici6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarLlista {
	public static void main(String[] args) {

		List<Object> llista = new ArrayList<>();
		llista.add("JamesBond");
		llista.add(7623);
		llista.add("tree");
		llista.add(7);
		llista.add("ochocientosochentayocho");
		llista.add("1");
		// EXPRESION LAMBDA USANDO COMPARATOR SIEMPRE Y CUANDO SEAN STRINGS(SI NO SON
		// STRINGS LOS PONE AL PPIO)

List<Object> sortedList = llista.stream()
		.sorted(Comparator.comparingInt(o -> o instanceof String ? ((String) o).length() : 0))
		.collect(Collectors.toList());
		System.out.println(sortedList);
//		Collections.sort(llista,
//		Comparator.comparingInt(o -> o instanceof String ? ((String) o).length() : 0));
//
//		System.out.println("Llista ordenada: " + llista);
	}
}
