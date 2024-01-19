package n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ListaDirectorio {

	private String rutaDirectorio;

	public ListaDirectorio(String rutaDirectorio) {
		this.rutaDirectorio = rutaDirectorio;
	}

	public void listarContenido() {
		File directorio = new File(rutaDirectorio);
		if (directorio.isDirectory()) {                    //COMPROBAMOS QUE ES UN DIRECTORIO Y APLICAMOS EL METODO
			listarDirectorioRecursivamente(directorio, 0);
		} else {
			System.out.println("La ruta especificada no corresponde a un directorio.");
		}
	}

	private void listarDirectorioRecursivamente(File directorio, int nivel) {
		File[] contenido = directorio.listFiles();
		if (contenido != null) {
			Arrays.sort(contenido);
			for (File elemento : contenido) {
				String tipo = (elemento.isDirectory()) ? "D" : "F"; //forma abreviada de if/else (IF TRUE "D", ELSE "F")
				String indentacion = "";
				for (int i = 0; i < nivel; i++) {
					indentacion += "  ";
				}
				SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String fechaModificacion = formatoFecha.format(elemento.lastModified());
				System.out.println(indentacion + tipo + " - " + elemento.getName() + " - Última Modificación: "
						+ fechaModificacion);

				if (elemento.isDirectory()) {
					listarDirectorioRecursivamente(elemento, nivel + 1);
				}
			}
		}
	}

}
