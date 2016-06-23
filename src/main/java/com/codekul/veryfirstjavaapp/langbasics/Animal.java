package com.codekul.veryfirstjavaapp.langbasics;

/**
 *
 * @author aniruddha
 */
public class Animal {

    private String name; // state -> fields -> properties
    private int age;
    private static boolean indian;
    
    public Animal(){
        // default
        
        //assigns some default values to state
        name = "Tigeer";
        age = 20;
    }
    
    public Animal(String nm, int ag){
        // paramatrized
        
        //assigns values form local parameters to state
        name = nm;
        age = ag;
    }
    
    public Animal(Animal animal){
        //copy 
        
        //copies data of local object
        name = animal.name;
        age = animal.age;
    }
    
    public void assignName(String name){
        
        // this will be replaced by 
        //caller object reference of this method
        this.name = name;
    }
    
    public String giveMeName(){ // behaviour
        
        System.out.println("Name is "+name);
        return name;
    }
    
    public int whatsAge(){
        
        System.out.println("Age is "+age);
        indian = true;
        
        return age;
    }
    
    public static boolean isIndian(){
        
        //age = 10; 
        //static methods can only access
        // static data
                      
        //age = 10;
        
        indian = false;
        return false;
    }
}
