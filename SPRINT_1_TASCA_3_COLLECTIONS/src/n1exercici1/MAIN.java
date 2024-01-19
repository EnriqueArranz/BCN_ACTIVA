package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Month enero = new Month("Enero");
		Month febrero = new Month("Febrero");
		Month marzo = new Month("Marzo");
		Month abril = new Month("Abril");
		Month mayo = new Month("Mayo");
		Month junio = new Month("Junio");
		Month julio = new Month("Julio");

		Month septiembre = new Month("Septiembre");
		Month octubre = new Month("Octubre");
		Month noviembre = new Month("Noviembre");
		Month diciembre = new Month("Diciembre");
		Month diciembre2 = new Month("Diciembre");

		ArrayList<Month> monthsList = new ArrayList<>();
		monthsList.add(enero);
		monthsList.add(febrero);
		monthsList.add(marzo);
		monthsList.add(abril);
		monthsList.add(mayo);
		monthsList.add(junio);
		monthsList.add(julio);

		monthsList.add(septiembre);
		monthsList.add(octubre);
		monthsList.add(noviembre);
		monthsList.add(diciembre);
		
		
		monthsList.add(diciembre);
		//añadimos otro objeto diciembre para comprobar que HashSet no contemple duplicados
		
		monthsList.add(7, new Month("Agosto"));
		

		System.out.println("Contenido del ArrayList:");
		for (Month month : monthsList) {
			System.out.println(month.getName());

		}
		HashSet<Month> monthsHashSet = new HashSet<>(monthsList);
		// si hay algún objeto repetido en la lista lo ignora
		
		
		System.out.println("\nContenido del HashSet (con bucle for):");
        for (Month month : monthsHashSet) {
            System.out.println(month.getName());
        }

        System.out.println("\nContenido del HashSet (con iterador):");
        Iterator<Month> iterator = monthsHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
        
	}

}
