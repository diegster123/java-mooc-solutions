
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;
    private int counter;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
        this.counter = 0;
    }

    public void add(String element) {
        this.elements.add(element);
        this.counter++;
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String printOutput = "The collection " + this.name;
        
        if (this.elements.isEmpty()){
            return printOutput + " is empty.";
        }
        
         String charOnList = String.join("\n", elements);
        
        if (this.elements.size() == 1){
            return printOutput + " has " + counter + " element:\n" + charOnList;
        }
        
        return printOutput + " has " + counter + " elements:\n" + charOnList;
    }
    
}
