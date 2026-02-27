
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift gift = new Gift("Diego Jumagdao tnagina yehes", 3);
        Gift gift1 = new Gift("Diego Jumagdao tnagina yehes", 5);
        
        System.out.println("Gift's name: " + gift.getName());
        System.out.println("Gift's weight: " + gift.getWeight());
        
        System.out.println("Gift: " + gift);
        
        Package gifts = new Package();
        
        gifts.addGift(gift);
        gifts.addGift(gift1);
        System.out.println(gifts.totalWeight());
    }
}
