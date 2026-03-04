
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstSum = 0;
        int secondSum = 0;
        int threshold = 100;

        while (true) {
            System.out.println("First: " + firstSum + "/" + threshold);
            System.out.println("Second: " + secondSum + "/" + threshold);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                firstSum += amount;
                if (firstSum > threshold) {
                    firstSum = threshold;
                }
            }

            if (command.equals("move") && amount > 0) {
                if (amount > firstSum) {
                    amount = firstSum;
                }
                firstSum -= amount;
                secondSum += amount;
                if (secondSum > threshold) {
                    secondSum = threshold;
                }
            }

            if (command.equals("remove") && amount > 0) {
                secondSum -= amount;
                if (secondSum < 0) {
                    secondSum = 0;
                }
            }
        }
    }
}
