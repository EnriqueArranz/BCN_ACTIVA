package n1exercici1;

public class TreballadorPresencial extends Treballador {

	private static int benzina = 90;

	public TreballadorPresencial(String string, String string2) {

	}

	@Override
	public void calcularSou(int hores) {
		// TODO Auto-generated method stub
		int sou = hores * preuHora;
		sou += benzina;
		System.out.println("El cost del traballador es de " + sou + " €.");

	}
}
