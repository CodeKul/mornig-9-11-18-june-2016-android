/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.interfaces;

/**
 *
 * @author aniruddha
 */
public class Starter {
 
    public void explainInterfaces(){
        
        GpsListener listnerBicycle = 
                new BiCycle();
        System.out.println("BiCycle - "+
                listnerBicycle.getLocation());
        
        
        GpsListener listenerPerson = 
                new Person();
        
        System.out.println("Person - "+
                listenerPerson.getLocation());
        
        BiCycle biCycle = 
                new BiCycle();
        biCycle.applyBreaks();
        biCycle.getLocation();
        
        // 1. one class can extends one class only 
        // 2. one class can implement multiple interfaces
        // 3. one interface can never implement other interface
        // 4. one interface can extends one or more interfaces 
    }
}
