
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numsCount = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int nums = Integer.valueOf(scanner.nextLine());
            
            if (nums == 0) {
                break;
            } else {
                numsCount = numsCount + 1;
            }
        }
        System.out.println("Number of numbers: " + numsCount);
    }
}
