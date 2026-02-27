
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String owner = "";
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] lines = input.split(",");
            int age = Integer.valueOf(lines[1]);
            String name = lines[0];
            
            if (age > oldest) {
                oldest = age;
                owner = name;
            }
        }
        System.out.println("Name of the oldest: " + owner);
    }
}
