package n1exercici1;

public class Percusion extends Instrument {

	

	public Percusion(String nom, int preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tocar() {
		System.out.println("Està sonant un instrument de percusio");
		return null;
	}

}
