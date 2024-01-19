package n1exercici4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> monthsList = new ArrayList<String>();

		monthsList.add("enero");
		monthsList.add("febrero");
		monthsList.add("marzo");
		monthsList.add("abril");
		monthsList.add("mayo");
		monthsList.add("junio");
		monthsList.add("julio");
		monthsList.add("agosto");
		monthsList.add("septiembre");
		monthsList.add("octubre");
		monthsList.add("noviembre");
		monthsList.add("diciembre");

		monthsList.forEach(System.out::println);//IMPRIMIR CON METHOD REFERENCE

	}

}
