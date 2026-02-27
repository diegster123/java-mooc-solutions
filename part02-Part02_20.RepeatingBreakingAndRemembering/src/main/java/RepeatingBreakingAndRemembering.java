
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int positiveCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        
        System.out.println("Give numbers:");
        
        while (true) {
            int nums = Integer.valueOf(scanner.nextLine());

            if (nums == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum = sum + nums;
            positiveCount = positiveCount + 1;

            if (nums % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
        }
        double average = 1.0 * sum / positiveCount;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + positiveCount);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}
