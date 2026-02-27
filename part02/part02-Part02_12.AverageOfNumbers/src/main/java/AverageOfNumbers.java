
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int numsCount = 0;
        
        
        while (true) {
            System.out.println("Give a number:");
            int nums = Integer.valueOf(scanner.nextLine());
            
            if (nums == 0) {
                break;
            } else {
                sum = sum + nums;
                numsCount = numsCount + 1;
            }
        }
        System.out.println("Average of the numbers: " + sum/(numsCount * 1.0));

    }
}
