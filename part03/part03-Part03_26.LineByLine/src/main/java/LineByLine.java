
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("")) {
                break;
            }
            String[] lines = word.split(" ");
            
            for (String line: lines) {
                System.out.println(line);
            }
//            for (int i = 0; i < lines.length; i++) {
//                System.out.println(lines[i]);
//            }
        }

    }
}
