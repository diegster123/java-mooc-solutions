
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

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList list, Scanner scanner) {
        this.todoList = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            processInput(input);
        }
    }

    public void processInput(String word) {
        if (word.equals("add")) {
            add();
        } else if (word.equals("list")) {
            list();
        } else if (word.equals("remove")) {
            remove();
        } else {
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.println("To add: ");
        String input = scanner.nextLine();
        this.todoList.add(input);
    }

    public void list() {
        this.todoList.print();
    }
    
    public void remove() {
        System.out.println("Which task was completed? ");
        int input = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(input);
    }

}
