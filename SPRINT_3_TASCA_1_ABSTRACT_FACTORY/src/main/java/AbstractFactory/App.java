package AbstractFactory;

public class App {
    public static void main(String[] args) {
        AgendaFactory spa = new SpainFactory();
        AgendaFactory uk = new EnglandFactory();
        ListOfRegisters agenda = new ListOfRegisters();
        boolean quit = false;
        do {
            int option = Reader.askInt("Choose your country: \n" +
                    "1. Spain \n" +
                    "2. UK \n" +
                    "3. Show Agenda\n" +
                    "4. Quit app\n");
            if (option == 1) {
                Register newRegister = new Register(spa);
                agenda.addRegister(newRegister);
                System.out.println("New register created succesfully");
                newRegister.print();
            } else if (option == 2) {
                Register newRegister = new Register(uk);
                agenda.addRegister(newRegister);
                System.out.println("New register created succesfully");
                newRegister.print();
            } else if (option == 3) {
                agenda.print();
            } else if (option == 4) {
                quit = true;
            }else{
                System.out.println("wrong option");
            }

        } while (!quit);
    }
}
