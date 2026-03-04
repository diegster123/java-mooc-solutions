
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstSum = 0;
        int secondSum = 0;
        int upperBound = 100;

        while (true) {
            System.out.println("First: " + firstSum + "/" + upperBound);
            System.out.println("Second: " + secondSum + "/" + upperBound);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                if (firstSum + amount > upperBound) {
                    firstSum = upperBound;
                } else {
                    firstSum += amount;
                }
            }

            if (command.equals("move") && amount > 0) {
                if (firstSum - amount < 0) {
                    int temp = firstSum;
                    firstSum = 0;
                    secondSum = temp;
                } else {
                    firstSum -= amount;
                    if (secondSum + amount > upperBound) {
                        secondSum = upperBound;
                    } else {
                        secondSum += amount;
                    }
                }
            }
            
            if (command.equals("remove") && amount > 0) {
                if (secondSum - amount < 0) {
                    secondSum = 0;
                } else {
                    secondSum -= amount;
                }
            }
        }
    }

}
