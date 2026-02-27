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

public class Room {

    private ArrayList<Person> list;

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        }

        Person first = list.get(0);

        for (Person person : this.list) {
            if (first.getHeight() > person.getHeight()) {
                first = person;
            }
        }
        return first;
    }

    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        }
        Person shortest = shortest();
        list.remove(shortest);
        
        return shortest;
        
    }

    public ArrayList<Person> getPersons() {
        return this.list;
    }
}
