
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value = Integer.valueOf(scanner.nextLine());
        int i = value;
        
//        for (int i = value; i <= 100; i++) {
//            System.out.println(i);
//        }

        while (true) {
            if (i <= 100) {
                System.out.println(i);
                i++;
            } else {
                break;
            }
        }

    }
}
