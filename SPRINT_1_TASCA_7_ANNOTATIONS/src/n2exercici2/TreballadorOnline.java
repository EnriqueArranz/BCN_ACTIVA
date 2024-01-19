package n2exercici2;

public class TreballadorOnline extends Treballador {

	
    
     
	private final int plusTelework= 35;
     
	@Override
	@Deprecated(since="2.1",forRemoval=true)//li diem des de quina versió del projecte no es vàlid
	public void calcularSou(int hores) {
		
		int sou = hores * preuHora;
		sou += plusTelework;
		System.out.println("El cost del traballador es de "+ sou +" €.");
	}

}
