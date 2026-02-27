
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Test your class here
        Room room = new Room();
        System.out.println("Shortest " + room.shortest());
        System.out.println(room.isEmpty());

        room.add(new Person("Diego", 173));
        room.add(new Person("Macy", 165));
        room.add(new Person("John", 168));
        System.out.println(room.isEmpty());

        for (Person person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.shortest());
        System.out.println("");

        System.out.println("Shortest: " + room.take());
        System.out.println("");

        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
    }
}
