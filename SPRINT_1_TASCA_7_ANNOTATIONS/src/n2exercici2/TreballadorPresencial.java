package n2exercici2;

public class TreballadorPresencial extends Treballador {

	private static int benzina = 90;

	public TreballadorPresencial() {

	}

	@Override 
	@Deprecated
	public void calcularSou(int hores) {
		// TODO Auto-generated method stub
		int sou = hores * preuHora;
		sou += benzina;
		System.out.println("El cost del traballador es de " + sou + " €.");

	}
}
