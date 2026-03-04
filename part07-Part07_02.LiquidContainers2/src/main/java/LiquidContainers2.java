
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                firstContainer.add(value);
            }

            if (command.equals("move")) {
                if (value > firstContainer.contains()) {
                    value = firstContainer.contains();
                }
                firstContainer.remove(value);
                secondContainer.add(value);
            }
            if (command.equals("remove")) {
                secondContainer.remove(value);
            }

        }
    }

}
