package n1exercici1;

public class Corda extends Instrument {


    public Corda(String nom, int preu) {
        super(nom, preu);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String tocar() {
        System.out.println("Està sonant un instrument de corda");
        return null;
    }


}
