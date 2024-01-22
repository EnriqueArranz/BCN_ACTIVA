package AbstractFactory;

public class PhoneEngland implements Phone {
    private int numTel;
    private int COUNTRYCODE= 33;

    public PhoneEngland(int numTel) {
        this.numTel = numTel;
    }

    @Override
    public void print() {
        System.out.println("+"+ COUNTRYCODE + "" + numTel);
    }
}
