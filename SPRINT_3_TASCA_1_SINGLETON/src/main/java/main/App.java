package main;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        Undo undo = Undo.getInstance();
        boolean quit = false;
        do {
            int option;
            option = askInt("0. Quit \n" +
                    "1. Introduce a command \n" +
                    "2. Undo the last command \n" +
                    "3. History of commands \n");
            switch (option) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    String command = askString("Introduce a command");
                    undo.addCommand(command);
                    break;
                case 2:
                    undo.undoCommand();
                    break;
                case 3:
                    undo.showHistoryCommands();
                    break;
                default:
                    System.out.println("This option is not valid");
            }
        } while (!quit);
    }

    public static int askInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int input = scanner.nextInt();
        return input;
    }

    public static String askString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();
        return input;
    }
}

