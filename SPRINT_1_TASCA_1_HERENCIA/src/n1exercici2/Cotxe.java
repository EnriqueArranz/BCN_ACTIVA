package n1exercici2;

public class Cotxe {

	private static final String marca = "Ferrari";
	private static String model ="testarossa";
	private final int potencia;
	
	
	public static String getModel() {
		return model;
	}


	public static void setModel(String model) {
		Cotxe.model = model;
	}


	public static String getMarca() {
		return marca;
	}


	public int getPotencia() {
		return potencia;
	}
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	public void acelerar() {
		System.out.println("El vehicle està accelerant");
	}
	
	public Cotxe (String marca,String model,int potencia) {
		
	
	Cotxe.model= "testarossa";
	this.potencia= potencia;
	
	}


	

}
