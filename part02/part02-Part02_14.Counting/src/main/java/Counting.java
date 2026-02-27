
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value = Integer.valueOf(scanner.nextLine());
        int i = 0;
        
//        for (int i = 0; i <= value; i++){
//            System.out.println(i);
//        }

        while (true) {
            if (i <= value){
                System.out.println(i);
                i++;
            }
            
        }
        

    }
}
