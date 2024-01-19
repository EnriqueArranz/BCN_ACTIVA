package n1exercici1;

public class Main {

	public static void main(String[] args) {
		Corda corda = new Corda("violin", 0);
        Percusion percusion = new Percusion("tambor",0);
        Vent vent = new Vent ("trompeta",0);
        
corda.tocar();
percusion.tocar();
vent.tocar();
vent.tocar();

String miString = "popeye";
		System.out.println(miString);
	}

}
