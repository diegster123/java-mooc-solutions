
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numsCount = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int nums = Integer.valueOf(scanner.nextLine());
            
            if (nums == 0) {
                break;
            } else {
                numsCount = numsCount + 1;
                sum = sum + nums;
            }
        }
        System.out.println("Number of numbers: " + numsCount);
        System.out.println("Sum of the numbers: " + sum);
    }
}
