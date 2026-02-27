
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int positiveCount = 0;
        
        while (true) {
            int nums = Integer.valueOf(scanner.nextLine());
            if (nums == 0) {
                break;
            } else if (nums > 0) {
                sum = sum + nums;
                positiveCount = positiveCount + 1;
            } 
            
        }
        if (positiveCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum/(positiveCount * 1.0));
        }
        
    }
}
