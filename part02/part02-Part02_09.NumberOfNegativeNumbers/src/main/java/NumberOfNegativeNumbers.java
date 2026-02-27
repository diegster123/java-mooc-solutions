
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int negativeCount = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int nums = Integer.valueOf(scanner.nextLine());
            
            if (nums == 0) {
                break;
            } else if (nums < 0) {
                negativeCount = negativeCount + 1;
            } 
        }
        System.out.println("Number of negative numbers: " + negativeCount);
    }
}
