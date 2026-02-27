/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Item item : this.items) {
            weight += item.getWeight();
        }
        return weight;
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item compare = this.items.get(0);
        
        for (Item item : this.items) {
            if (item.getWeight() > compare.getWeight()) {
                compare = item;
            }  
        }
        return compare;
    }

    public String toString() {
        int weight = totalWeight();
        String output = this.items.size() + " items (" + weight + " kg)";
        String singularOutput = this.items.size() + " item (" + weight + " kg)";

        if (items.isEmpty()) {
            return "no items " + "(" + weight + " kg)";
        }

        if (items.size() == 1) {
            return singularOutput;
        }

        return output;
    }
}
