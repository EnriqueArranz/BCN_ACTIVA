package AbstractFactory;

public class PhoneSpain implements Phone {


    private int numTel;
    private int COUNTRYCODE= 34;

    @Override
    public void print() {
        System.out.println("+"+COUNTRYCODE+numTel);
    }
}
