package n2exercici2;

public class Main {

	@SuppressWarnings({ "deprecation", "removal" }) // VOLEM QUE CONTINUI FUNCIONANT PERÒ QUE SI ALGÚ FA SERVIR ELS
													// METODES OBTINGUI UN WARNING PER ESTAR OBSOLET
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Treballador treballador = new Treballador();
		treballador.calcularSou(80);
		TreballadorOnline treballadoronline = new TreballadorOnline();
		treballadoronline.calcularSou(80);
		TreballadorPresencial treballadorpresencial = new TreballadorPresencial();
		treballadorpresencial.calcularSou(80);
	}

}
