
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First Number?");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int num2 = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        
        
//        for (int i = num1; i <= num2; i++){
//            sum = sum + i;
//        }
        while (num1 <= num2) {
            sum = sum + num1;
            num1++;
        }
        System.out.println(sum);
    }
}
