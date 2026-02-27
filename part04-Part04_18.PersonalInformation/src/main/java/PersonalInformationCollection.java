
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("First Name: ");
            String firstName = scanner.nextLine();
            
            if (firstName.isEmpty()) {
                break;
            }
            System.out.println("Last Name: ");
            String lastName = scanner.nextLine();
            
            System.out.println("Identification Number: ");
            String identityNum = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, identityNum));
        }
//        for (PersonalInformation info : infoCollection) {
//            System.out.println(info.getFirstName() + " " + info.getLastName());
//        }
        for (int i = 0; i < infoCollection.size(); i++) {
            PersonalInformation info = (infoCollection.get(i));
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
        
        
    }
}
