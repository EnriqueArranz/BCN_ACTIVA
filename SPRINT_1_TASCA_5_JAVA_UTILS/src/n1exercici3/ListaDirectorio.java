package n1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ListaDirectorio {
	private String rutaDirectorio;

	public ListaDirectorio(String rutaDirectorio) {
		this.rutaDirectorio = rutaDirectorio;
	}

	public void listarContenido() {       //INTEGRAMOS LA INFORMACION DENTRO DE UN ARCHIVO.TXT
		File archivoSalida = new File("resultado.txt");

        BufferedWriter writer = null;
		try {
            writer = new BufferedWriter(new FileWriter(archivoSalida));
            File directorio = new File(rutaDirectorio);
            if (directorio.isDirectory()) {
                listarDirectorioRecursivamente(directorio, 0);
            } else {
                writer.write("La ruta especificada no corresponde a un directorio.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	 }

	private void listarDirectorioRecursivamente(File directorio, int nivel) {
		File[] contenido = directorio.listFiles();
		if (contenido != null) {
			Arrays.sort(contenido);
			for (File elemento : contenido) {
				String tipo = (elemento.isDirectory()) ? "D" : "F";  //forma abreviada de if/else (IF TRUE "D", ELSE "F")
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
