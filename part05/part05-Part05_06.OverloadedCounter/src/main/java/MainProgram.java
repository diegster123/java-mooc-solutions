
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter c = new Counter(5);
        Counter b = new Counter();
        
        System.out.println(c);
        System.out.println(b);
        
        c.increase();
        c.increase();
        b.decrease();
        
        System.out.println(c);
        System.out.println(b);
        
        c.increase(5);
        b.decrease(5);
        System.out.println(c);
        System.out.println(b);
    }
}
