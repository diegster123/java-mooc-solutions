/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Container {
    private int threshold;
    private int sum;
    
    public Container() {
        this.threshold = 100;
        this.sum = 0;
    }
    
    public void add(int amount) {
        if (amount > 0) {
           this.sum += amount;
        }
        if (this.sum > this.threshold) {
            this.sum = this.threshold;
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.sum -= amount;
        }
        if (this.sum < 0) {
            this.sum = 0;
        }
    }
    
    public int contains() {
        return this.sum;
    }
    
    public String toString() {
        return this.sum + "/" + this.threshold;
    }
}
