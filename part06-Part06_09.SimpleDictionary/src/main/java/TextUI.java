/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();

            if (willEnd(input)) {
                break;
            }
            addOrSearch(input);
        }
    }

    public boolean addOrSearch(String word) {
        if (word.equals("add")) {
            System.out.println("Word: ");
            String wordInput = scanner.nextLine();
            System.out.println("Translation: ");
            String translation = scanner.nextLine();
            this.dict.add(wordInput, translation);
        } else if (word.equals("search")) {
            System.out.println("To be translated: ");
            String translated = scanner.nextLine();
            if (this.dict.translate(translated) == null) {
                System.out.println("Word " + translated + " was not found");
            } else {
                System.out.println("Translation: ");
                System.out.println(this.dict.translate(translated));
            }
        } else {
            System.out.println("Unknown command");
        }
        return false;
    }

    public boolean willEnd(String word) {
        if (word.equals("end")) {
            System.out.println("Bye bye!");
            return true;
        }
        return false;
    }

}
