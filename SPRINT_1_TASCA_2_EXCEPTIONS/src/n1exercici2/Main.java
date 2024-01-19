package n1exercici2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		llegirByte("Introdueix la teva edat: ");
		llegirInt("Introdueix el teu codi postal: ");
		llegirString("Introdueix el teu nom");
		llegirFloat("Introdueix el teu nom");
		llegirDouble("Introdueix el teu nom");
		llegirChar("Introdueix la lletra del DNI");
		llegirString("Introdueix el teu nom");
		llegirSiNo("Tens carnet de conduir?");

	}

	public static byte llegirByte(String missatge) {
		byte resultat = 0;
		boolean dadaCorrecta = false;
		do {
			try {
				System.out.print(missatge + "\n");
				resultat = scanner.nextByte();
				dadaCorrecta = true;
				System.out.println("Dada correcta " + "(" + resultat + ")");
			} catch (InputMismatchException e) {
				System.out.println("Error de format. Introdueix un byte vàlid.");
				scanner.next(); // Limpiar el buffer del scanner
			}
		} while (!dadaCorrecta);
		return resultat;
	}

	public static int llegirInt(String missatge) {
		int resultat = 0;
		boolean dadaCorrecta = false;
		do {
			try {
				System.out.print(missatge + "\n");
				resultat = scanner.nextInt();
				dadaCorrecta = true;
				System.out.println("Dada correcta " + "(" + resultat + ")");
			} catch (InputMismatchException e) {
				System.out.println("Error de Nformat. Introdueix un enter vàlid.");
				scanner.next(); // Limpiar el buffer del scanner
			}
		} while (!dadaCorrecta);
		return resultat;
	}

	public static float llegirFloat(String missatge) {
		float resultat = 0;
		boolean dadaCorrecta = false;
		do {
			try {
				System.out.print(missatge + "\n");
				resultat = scanner.nextFloat();
				dadaCorrecta = true;
				System.out.println("Dada correcta " + "(" + resultat + ")");
			} catch (InputMismatchException e) {
				System.out.println("Error de format. Introdueix un nombre decimal vàlid.");
				scanner.next(); // Limpiar el buffer del scanner
			}
		} while (!dadaCorrecta);
		return resultat;
	}

	public static double llegirDouble(String missatge) {
		double resultat = 0;
		boolean dadaCorrecta = false;
		do {
			try {
				System.out.print(missatge + "\n");
				resultat = scanner.nextDouble();
				dadaCorrecta = true;
				System.out.println("Dada correcta " + "(" + resultat + ")");
			} catch (InputMismatchException e) {
				System.out.println("Error de format. Introdueix un nombre decimal vàlid.");
				scanner.next(); // Limpiar el buffer del scanner
			}
		} while (!dadaCorrecta);
		return resultat;
	}

	public static char llegirChar(String missatge) {
		char resultat = '\0';
		boolean dadaCorrecta = false;
		do {
			try {
				System.out.print(missatge + "\n");
				resultat = scanner.next().charAt(0);
				dadaCorrecta = true;
				System.out.println("Dada correcta " + "(" + resultat + ")");
			} catch (Exception e) {
				System.out.println("Error. Introdueix un caràcter vàlid.");
				scanner.next(); // Limpiar el buffer del scanner
			}
		} while (!dadaCorrecta);
		return resultat;
	}

	public static String llegirString(String missatge) {
		String resultat = null;
		boolean dadaCorrecta = false;
		do {
			try {
				System.out.print(missatge + "\n");
				resultat = scanner.nextLine();
				dadaCorrecta = true;
				System.out.println("Dada correcta " + "(" + resultat + ")");
			} catch (Exception e) {
				System.out.println("Error. Introdueix una cadena vàlida.");
				scanner.next(); // Limpiar el buffer del scanner
			}
		} while (!dadaCorrecta);
		return resultat;
	}

	public static boolean llegirSiNo(String missatge) {
		boolean resultat = false;
		boolean dadaCorrecta = false;
		do {
			try {
				System.out.print(missatge + "(s/n): " + "\n");
				String resposta = scanner.next().toLowerCase();
				if (resposta.equals("s")) {
					resultat = true;
					dadaCorrecta = true;
					System.out.println("Dada correcta " + "(" + resultat + ")");
				} else if (resposta.equals("n")) {
					dadaCorrecta = true;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Error. Introdueix 's' per a sí o 'n' per a no.");
				scanner.next(); // Limpiar el buffer del scanner
			}
		} while (!dadaCorrecta);
		return resultat;
	}

	public static void tancarScanner() {
		scanner.close();
	}
}
