package AbstractFactory;

public class Register {
    private Phone tel;
    private Address address;

    public Register(AgendaFactory newFactory) {
        tel = newFactory.createPhone();
        address = newFactory.createAddress();
    }
    public void print(){
        tel.print();
        address.print();
    }
}
