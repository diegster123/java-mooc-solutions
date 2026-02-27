
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int nums = Integer.valueOf(scanner.nextLine());
            
            if (nums == 0) {
                break;
            } else {
                sum = sum + nums;
            }
        }
        System.out.println("Sum of the numbers: " + sum);
    }
}
