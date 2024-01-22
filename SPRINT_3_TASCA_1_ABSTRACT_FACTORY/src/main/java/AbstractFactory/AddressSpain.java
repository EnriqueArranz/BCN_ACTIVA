package AbstractFactory;

public class AddressSpain implements Address {
    private String city;
    private String street;
    private int num;
    private int floor;
    private int door;
    private final String COUNTRY = "spain";

    public AddressSpain(String city, String street, int num, int floor, int door) {
        this.city = city;
        this.street = street;
        this.num = num;
        this.floor = floor;
        this.door = door;
    }

    @Override
    public void print() {
        System.out.println("Address [city=" + city.toUpperCase() + ", street=" + street.toUpperCase() + ", num=" + num + ", floor=" + floor + ", door="
                + door + ", COUNTRY=" + COUNTRY.toUpperCase() + "]");
    }
}
