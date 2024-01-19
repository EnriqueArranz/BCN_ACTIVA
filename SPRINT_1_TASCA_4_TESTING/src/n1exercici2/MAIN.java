package n1exercici2;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Introdueixi el teu numero de DNI: ");
		int numDni = scanner.nextInt();
		
		calcularLetraDni(numDni);
		
		
	}
	public static char calcularLetraDni(int numeroDni) {
		String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
		int indiceLetra = numeroDni % 23;
		System.out.println(letrasDni.charAt(indiceLetra));
		return letrasDni.charAt(indiceLetra);
	}
}
