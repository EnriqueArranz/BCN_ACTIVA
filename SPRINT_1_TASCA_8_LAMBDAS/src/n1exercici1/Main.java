package n1exercici1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<String> filteredList = Stream.of("Antonio", "Paco", "Ana", "Julia").filter(s -> s.contains("o")).collect(Collectors.toList());

        // .filter(s -> s.startsWith("P"));// FILTRO PARA PRIMERA LETRA DEL STRING
        // .map (s -> s.toUpperCase()); // UTILIDAD PARA MODIFICAR CONTENIDO
        // .count(); //NOS DEVUELVE LA CUENTA
        // .anyMatch(s -> s.contains("o"));// BOOLEANO TIPO EXISTS
        //List<String> lista = streamOfStrings.collect(Collectors.toList());
             System.out.println(filteredList);


    }

}
