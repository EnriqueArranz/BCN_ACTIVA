package AbstractFactory;

public class App {
    public static void main(String[] args) {
        AgendaFactory spa = new SpainFactory();
        AgendaFactory uk = new EnglandFactory();
        int option = Reader.askInt("Choose your country: \n" +
                "1. Spain \n" +
                "2. UK \n");
        if (option == 1) {
            Register newRegister = new Register(spa);

        } else if (option == 2) {
            Register newRegister = new Register(uk);
        }
    }
}
