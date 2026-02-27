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

public class Stack {
    
    private ArrayList<String> list;
    
    
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
//        ArrayList<String> stack = new ArrayList<>();
//        
//        for (String value : list) {
//            stack.add(value);
//        }
//        
//        return stack;
        return this.list;
    }
    
    public String take() {
        String last = this.list.remove(this.list.size() - 1);
        return last;
    }
}
