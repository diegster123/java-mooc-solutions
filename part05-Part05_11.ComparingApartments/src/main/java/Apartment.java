
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getFullPrice() {
        return this.squares * this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared) { 
        return Math.abs((getFullPrice()) - (compared.getFullPrice()));
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getFullPrice() > compared.getFullPrice()) {
            return true;
        }
        return false;
    }

}
