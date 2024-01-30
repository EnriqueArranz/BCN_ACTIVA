import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analizador {
    public static void unicoBucle(String poema) {
        List<String> listaCaracteres = Arrays.stream(poema.split("")).collect(Collectors.toList());
        List<String> listaPuntos = Arrays.stream(poema.split("\\.")).collect(Collectors.toList());
        List<String> listaPalabras = Arrays.stream(poema.split(" ")).collect(Collectors.toList());
        List<String> listaComas = Arrays.stream(poema.split(",")).collect(Collectors.toList());
        System.out.println("Palabras " + listaPalabras.size());
        System.out.println("Oraciones " + listaPuntos.size());
        float avg = (listaCaracteres.size() - listaComas.size() - listaPuntos.size()) / (listaPalabras.size());
        System.out.println("Media caracteres " + avg);
    }
}
