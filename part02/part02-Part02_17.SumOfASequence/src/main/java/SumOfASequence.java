
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        int i = 1; 
        
//        for (int i = 1; i <= number; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

        while (i <= number) {
            sum = sum + i;
            i++;
        }
        
        System.out.println(sum);

    }
}
