

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        int longest = 0;
        String owner = "";
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            String[] lines = input.split(",");
            int age = Integer.valueOf(lines[1]);
            count++;
            sum += age;
            
            String name = lines[0];
            int length = name.length();
            
            if (length > longest) {
                longest = length;
                owner = name;
            }
            
        }
        System.out.println("Longest name: " + owner);
        if (count > 0) {
            System.out.println("Average of the birth years: " + (1.0 * sum / count));
        } else {
            System.out.println("No input.");
        }
    }
}
