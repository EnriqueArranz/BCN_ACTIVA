package n1exercici1;

public class Treballador {

	private String nom;
	private String cognom;
    final int preuHora = 20;



	public Treballador(String nom, String cognom) {
		super();
		this.nom = nom;
		this.cognom = cognom;
	}

	public Treballador() {
		// TODO Auto-generated constructor stub
	}

	

	public void calcularSou(int hores) {

		int sou = hores * preuHora;
		System.out.println("El cost del traballador es de " + sou + " €.");

	}
}