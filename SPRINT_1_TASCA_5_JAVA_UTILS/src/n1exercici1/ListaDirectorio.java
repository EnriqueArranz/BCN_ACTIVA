package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class ListaDirectorio {

	private String rutaDirectorio;

	public ListaDirectorio(String rutaDirectorio) {
		this.rutaDirectorio = rutaDirectorio;
	}

	public void listarContenido() {
		File directorio = new File(rutaDirectorio);
		if (directorio.isDirectory()) {
			String[] contenido = directorio.list();
			if (contenido != null) {
				Arrays.sort(contenido);
				for (String archivo : contenido) {
					System.out.println(archivo);
				}
			} else {
				System.out.println("El directorio está vacío.");
			}
		} else {
			System.out.println("La ruta especificada no corresponde a un directorio.");
		}
	}

}
