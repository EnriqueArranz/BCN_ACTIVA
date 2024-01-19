package n1exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		HashMap<String, String> paisosCapitals = llegirFitxer();
		if (paisosCapitals.isEmpty()) {
			System.out.println("No s'han pogut llegir les dades del fitxer.");
			return;
		}

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introdueix el teu nom d'usuari/ària: ");
		String nomUsuari = scanner.nextLine();

		int puntuacio = 0;
		for (int i = 0; i < 10; i++) {
			String pais = obtenirPaisAleatori(paisosCapitals);
			String capital = paisosCapitals.get(pais);

			System.out.print("Capital de " + pais + ": ");
			String respostaUsuari = scanner.nextLine();

			if (respostaUsuari.equalsIgnoreCase(capital)) {
				puntuacio++;
				System.out.println("Encertat! Puntuació: " + puntuacio);
			} else {
				System.out.println("Incorrecte. La capital és: " + capital);
			}
		}

		desarPuntuacio(nomUsuari, puntuacio);
		System.out.println("El programa ha finalitzat, la teva puntuació és de "+puntuacio+" punts.");

	}

	private static HashMap<String, String> llegirFitxer() {
		String rutaArchivo = "countries.txt";
		HashMap<String, String> paisosCapitals = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] partes = linea.split(" ");
				if (partes.length >= 2) {
					String pais = partes[0];
					String capital = partes[1];
					paisosCapitals.put(pais, capital);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return paisosCapitals;
	}

	private static String obtenirPaisAleatori(HashMap<String, String> paisosCapitals) {
		Random rand = new Random();
		Object[] paisos = paisosCapitals.keySet().toArray();
		return (String) paisos[rand.nextInt(paisos.length)];
	}

	private static void desarPuntuacio(String nomUsuari, int puntuacio) {
		try (FileWriter writer = new FileWriter("classificacio.txt", true)) {
			writer.write(nomUsuari + ": " + puntuacio + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
