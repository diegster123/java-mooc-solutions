/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Archive {
    private String identifier, name;
    
    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Archive)) return false;
        
        Archive archiveCompare = (Archive) obj;
        
        return this.identifier.equals(archiveCompare.identifier);
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
