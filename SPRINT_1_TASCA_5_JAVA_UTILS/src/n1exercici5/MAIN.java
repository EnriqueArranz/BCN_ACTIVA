package n1exercici5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;


public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LISTAMOS CONTENIDO Y LO CLASIFICAMOS EN DIRECTORIO(D) O ARCHIVO (F)
		String rutaDirectorio = "./src/directori";
		ListaDirectorio lista = new ListaDirectorio(rutaDirectorio);
		lista.listarContenido();

		// GUARDAMOS EL CONTENIDO EN UN ARCHIVO (Archivo_Directorio)
		String nomFitxerSortida = "Archivo_Directorio";
		File fitxerSortida = new File(nomFitxerSortida);

		try (FileWriter writer = new FileWriter(fitxerSortida)) {
			guardarEnFitxer(new File(rutaDirectorio), writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// LEEMOS EL CONTENIDO DE UN ARCHIVO (Archivo_Directorio)
		System.out.println("LECTURA");
		readFile("Archivo_Directorio");

		// SERIALIZAMOS OBJETO
		Persona persona1 = new Persona("Enrique", 31);
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
			out.writeObject(persona1);
			System.out.println("Objecte serialitzat amb èxit.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// DESSERIALIZAMOS OBJETO
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("persona.ser"))) {
			Persona personaDesserialitzada = (Persona) in.readObject();
			System.out.println("Objecte desserialitzat: Nom: " + personaDesserialitzada.nom + ", Edat: "
					+ personaDesserialitzada.edat);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//MISMA OPERACION PERO LLAMANDO A MÉTODO Y PASÁNDOLE POR PARAMETRO EL OBJETO Y EL NOMBRE DEL ARCHIVO OUTPUT
		serializarObjeto(persona1,"persona.ser");
		desSerializarObjeto(persona1,"persona.ser");
		

	}

	private static void guardarEnFitxer(File folder, FileWriter writer) throws IOException {
		File[] files = folder.listFiles();
		if (files != null) {
			Arrays.sort(files); // ORDENAMOS ALFABETICAMENTE
			for (File file : files) {
				writer.write(file.getName()); // ESCRIBIMOS EL NOMBRE DEL ARCHIVO
				if (file.isDirectory()) { // CLASIFICAMOS ENTRE DIRECTORY O FILE
					writer.write(" (D)");
				} else {
					writer.write(" (F)");
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// CREAMOS OBJETO PARA FORMATO FECHA
				writer.write(" - Última modificació: " + sdf.format(file.lastModified()) + "\n");// AÑADIMOS FECHA UM
				if (file.isDirectory()) { // VOLVEMOS A LANZAR EL METODO SI EL ARCHIVO ES DIRECTORIO
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

	private static void serializarObjeto(Object objeto, String nombreArchivo) {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
			out.writeObject(objeto);
			System.out.println("Objeto serializado y guardado en " + nombreArchivo);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void desSerializarObjeto(Object objeto, String nombreArchivo) {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
			Persona personaDesserialitzada = (Persona) in.readObject();
			System.out.println("Objecte desserialitzat: Nom: " + personaDesserialitzada.nom + ", Edat: "
					+ personaDesserialitzada.edat);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
