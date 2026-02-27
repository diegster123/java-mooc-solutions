
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);

        Stack n = new Stack();
        n.add("1");
        n.add("2");
        n.add("3");
        n.add("4");
        n.add("5");

        while (!n.isEmpty()) {
            System.out.println(n.take());
        }
        
        

    }
}
