package n1exercici1;

public class TreballadorOnline extends Treballador {

	
    
     
	private final int plusTelework= 35;
     
	public TreballadorOnline(String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	



	public TreballadorOnline() {
		super();
		// TODO Auto-generated constructor stub
	}




	public TreballadorOnline(String nom, String cognom, int preuHora) {
		super(nom, cognom);
		// TODO Auto-generated constructor stub
	}



	@Override 
	public void calcularSou(int hores) {
		
		int sou = hores * preuHora;
		sou += plusTelework;
		System.out.println("El cost del traballador es de "+ sou +" €.");
	}

}
