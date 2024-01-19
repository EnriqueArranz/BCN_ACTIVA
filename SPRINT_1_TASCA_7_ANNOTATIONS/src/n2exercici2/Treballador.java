package n2exercici2;

public class Treballador {

	private String nom;
	private String cognom;
	protected int preuHora = 20;

	public Treballador(String nom, String cognom, int preuHora) {
		super();
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}

	public Treballador() {
		// TODO Auto-generated constructor stub
	}

	public void calcularSou(int hores) {

		int sou = hores * preuHora;
		System.out.println("El cost del traballador es de " + sou + " €.");

	}
}