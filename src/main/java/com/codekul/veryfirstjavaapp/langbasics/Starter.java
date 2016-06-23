/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.langbasics;

/**
 *
 * @author aniruddha
 */
public class Starter {
    
    public void howToCreateObject(){
        
        Animal animal = 
                new Animal(); // object
        
        String name = animal.giveMeName();
        
        int age = animal.whatsAge();
    }
    
    public void whatIsStatic(){
        
        // you dont need object of class
        Animal.isIndian();
    }
    
    public void howToWorkWithConstructors(){
        
        // to initilize state at the time of
        // object creation
        
        Animal animalTiger = 
                new Animal(); //  default
        animalTiger.whatsAge();
        animalTiger.giveMeName();
        
        Animal animalLion = 
                new Animal("lion", 10); // paramatrized
        animalLion.whatsAge();
        animalLion.giveMeName();
        
        Animal animalElephant = 
                new Animal(animalLion); // copy
        animalElephant.whatsAge();
        animalElephant.giveMeName();
    }
    
    public void whatIsThisKeyword(){
        
        Animal animal = new Animal();
        animal.assignName("Monkey");
        animal.giveMeName();
        
        Animal animalTiger = new Animal();
        animalTiger.assignName("Tiger");
        animalTiger.giveMeName();
    }
    
    public void howToAchieveOverloading(){
        
        Physics physics = 
                new Physics();
        physics.calculateEnergy();
        physics.calculateEnergy(5);
        physics.calculateEnergy(10,5);
        //polymorphisam -> late binding ->
        //runtime binding
        
    }
}
