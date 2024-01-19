package n1exercici1;

public class Vent extends Instrument {

	public Vent(String nom, int preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tocar() {
		System.out.println("Està sonant un instrument de vent");
		return null;
	}

}
