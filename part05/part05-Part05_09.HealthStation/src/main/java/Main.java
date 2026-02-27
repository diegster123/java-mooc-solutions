
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childrensHospital = new HealthStation();

        Person diego = new Person("Diego", 24, 173, 85);
        Person tabby = new Person("Tabby", 33, 176, 35);
        
        System.out.println(diego.getName() + " weight: " + childrensHospital.weigh(diego) + " kilos");
        System.out.println(tabby.getName() + " weight: " + childrensHospital.weigh(tabby) + " kilos");
        
        childrensHospital.feed(diego);
        childrensHospital.feed(tabby);
        childrensHospital.feed(tabby);
        System.out.println("");
        
        System.out.println(diego.getName() + " weight: " + childrensHospital.weigh(diego) + " kilos");
        System.out.println(tabby.getName() + " weight: " + childrensHospital.weigh(tabby) + " kilos");
        
        System.out.println("weighings performed: " + childrensHospital.weighings());
        

    }
}
