package n1exercici4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

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
		//LEEMOS EL CONTENIDO DE UN ARCHIVO (Archivo_Directorio)
		System.out.println("LECTURA");
		readFile("Archivo_Directorio");
		
	}

	private static void guardarEnFitxer(File folder, FileWriter writer) throws IOException {
		File[] files = folder.listFiles();
		if (files != null) {
			Arrays.sort(files);               //ORDENAMOS ALFABETICAMENTE
			for (File file : files) {
				writer.write(file.getName()); //ESCRIBIMOS EL NOMBRE DEL ARCHIVO
				if (file.isDirectory()) {     //CLASIFICAMOS ENTRE DIRECTORY O FILE
					writer.write(" (D)");   
				} else {
					writer.write(" (F)");
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//CREAMOS OBJETO PARA FORMATO FECHA
				writer.write(" - Última modificació: " + sdf.format(file.lastModified()) + "\n");//AÑADIMOS FECHA UM
				if (file.isDirectory()) {   //VOLVEMOS A LANZAR EL METODO SI EL ARCHIVO ES DIRECTORIO
					guardarEnFitxer(file, writer);
				}
			}
		}
	}

	private static void readFile(String nomFitxer) {

		try (BufferedReader reader = new BufferedReader(new FileReader(nomFitxer))) {
			String linea;
			while ((linea = reader.readLine()) != null) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
