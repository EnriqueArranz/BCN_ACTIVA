package n1exercici2;

public class CalculoDni {

	public static char calcularLetraDni(int numeroDni) {
		String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
		int indiceLetra = numeroDni % 23;
		return letrasDni.charAt(indiceLetra);
	}
}
