import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()) {
                String number = scan.nextLine();
                int nums = Integer.valueOf(number);
                numList.add(nums);
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        for (Integer nums : numList) {
            if (nums >= lowerBound && nums <= upperBound) {
                count++;
            }
        }
        
        System.out.println("Numbers: " + count);
        
    }

}
