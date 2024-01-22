package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class ListOfRegisters {

    private List<Register> registers;

    public ListOfRegisters() {
        this.registers = new ArrayList<>();
    }


    // Method to add a new register to the list
    public void addRegister(Register register) {
        registers.add(register);
    }

    public void print() {
        for (Register register : registers) {
            register.print();
        }
    }
}

