
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archiveList = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }
            Archive archive = new Archive(identifier, name);
            if (!(archiveList.contains(archive))) {
                archiveList.add(archive);
            } else {
                continue;
            }
        }
        for (Archive archive : archiveList) {
            System.out.println(archive);
        }

    }
}
