package n1exercici2;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona("Juan","Arranz",31);
		String texto = "Elefante";
		int num1 = 8;
		
		
		GenericMethods genericMethods1 = new GenericMethods();
		
		genericMethods1.printArguments(persona1.toString(),texto,num1);
		genericMethods1.printArguments(num1,persona1.toString(),texto);

	}

}
