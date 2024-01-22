package AbstractFactory;

public class SpainFactory implements AgendaFactory {
    private final int PHONE_NUMBER_LENGTH = 9;

    @Override
    public Phone createPhone() {
        boolean lenghtOk = false;
        int numTel = 0;
        while (!lenghtOk) {
            numTel = Reader.askInt("Introduce your phone number");
            String numString = Integer.toString(numTel);
            if (PHONE_NUMBER_LENGTH == numString.length()) {
                lenghtOk = true;
            } else {
                System.out.println("Introduce a 9 digits number");
            }
        }
        return new PhoneSpain(numTel);
    }

    @Override
    public Address createAddress() {
        String city = Reader.askString("Introduce city");
        String street = Reader.askString("Introduce street name");
        int num = Reader.askInt("Introduce street number");
        int floor = Reader.askInt("Introduce floor number");
        int door = Reader.askInt("Introduce door number");
        return new AddressEngland(city, street, num, floor, door);
    }
}
