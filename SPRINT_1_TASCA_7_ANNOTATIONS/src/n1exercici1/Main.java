package n1exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Treballador treballador = new Treballador("Paco","Lopez");
		treballador.calcularSou(80);
		TreballadorOnline treballadoronline = new TreballadorOnline("Maria","Cortazar");
		treballadoronline.calcularSou(80);
		TreballadorPresencial treballadorpresencial = new TreballadorPresencial("Luis","Marzo");
		treballadorpresencial.calcularSou(80);
	}

}
