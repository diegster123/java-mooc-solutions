
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class UserInterface {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("What a joke!");
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String command = scanner.nextLine();
            if (command.equals("X")) {
                break;
            }
            processInput(command);
        }
    }

    public void processInput(String command) {
        if (command.equals("1")) {
            one();
        } else if (command.equals("2")) {
            two();
        } else if (command.equals("3")) {
            three();
        }
    }

    public void one() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokes.addJoke(joke);
    }

    public void two() {
        System.out.println("Drawing a joke.");
        System.out.println(this.jokes.drawJoke());
    }

    public void three() {
        System.out.println("Printing the jokes");
        this.jokes.printJokes();
    }

}
