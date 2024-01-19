package n1exercici7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		// STRINGS LOS PONE AL PPIO) SE AÑADE EL METODO .REVERSED()

		List<Object> sortedList = llista.stream()
				.sorted(Comparator.comparingInt(o -> o instanceof String ? ((String) o).length(): 0 ).reversed()).toList();


		System.out.println("Llista ordenada: " + sortedList);

	}
}
