package AbstractFactory;

public class AddressUK implements Address {
    private String city;
    private String street;
    private int num;
    private String floor;
    private String door;
    private final String COUNTRY = "UK";

    public AddressUK(String city, String street, int num, String floor, String door) {
        this.city = city;
        this.street = street;
        this.num = num;
        this.floor = floor;
        this.door = door;
    }

    @Override
    public void print() {
        System.out.println("Address [house number=" + num + ", street name=" + street + ", floor=" + floor + ", door=" + door +", city=" + city +
                ", COUNTRY=" + COUNTRY);
    }
}
