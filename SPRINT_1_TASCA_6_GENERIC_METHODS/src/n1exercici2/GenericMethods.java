package n1exercici2;

public class GenericMethods {

	public <T> void printArguments(T generic1, T generic2, T generic3) {
		System.out.println("Objecte 1: " + generic1);
		System.out.println("Objecte 2: " + generic2);
		System.out.println("Objecte 3: " + generic3);
	}
}