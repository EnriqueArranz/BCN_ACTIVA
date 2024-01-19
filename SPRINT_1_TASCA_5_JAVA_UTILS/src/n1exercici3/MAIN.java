package n1exercici3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class MAIN {

	public static void main(String[] args) {
		//LISTAMOS CONTENIDO Y LO CLASIFICAMOS EN DIRECTORIO(D) O ARCHIVO (F)
		String rutaDirectorio = "./src/directori";
		ListaDirectorio lista = new ListaDirectorio(rutaDirectorio);
		lista.listarContenido();
		
		//GUARDAMOS EL CONTENIDO EN UN ARCHIVO (Archivo_Directorio)
		String nomFitxerSortida = "Archivo_Directorio";
		File fitxerSortida = new File(nomFitxerSortida);
		try (FileWriter writer = new FileWriter(fitxerSortida)) {
			guardarEnFitxer(new File(rutaDirectorio), writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	private static void guardarEnFitxer(File folder, FileWriter writer) throws IOException {
        File[] files = folder.listFiles();
        if (files != null) {
            Arrays.sort(files);
            for (File file : files) {
                writer.write(file.getName());
                if (file.isDirectory()) {
                    writer.write(" (D)");
                } else {
                    writer.write(" (F)");
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                writer.write(" - Última modificació: " + sdf.format(file.lastModified()) + "\n");
                if (file.isDirectory()) {
                    guardarEnFitxer(file, writer);
                }
            }
        }
    }

}
