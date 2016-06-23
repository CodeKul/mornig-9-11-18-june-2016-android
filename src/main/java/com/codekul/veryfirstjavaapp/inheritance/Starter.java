/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.inheritance;

/**
 *
 * @author aniruddha
 */
public class Starter {
    
    public void howInheritanceIsAchived(){
        
        Car car = new Car();
        car.setBrand("Audi");
        car.setPrice(45_000);
        
        System.out.println("Car Brand - "+car.getBrand());
        
        Mercedez mercedez = new Mercedez();
        mercedez.setBrand("May Baech");
        mercedez.setPrice(12_0000_0000);
        mercedez.setCountry("Japan");
        
        mercedez.speedUp();
        
        System.out.println(" **** Mercedez ****");
        System.out.println("Brand - "+mercedez.getBrand());
        System.out.println("Price - "+mercedez.getPrice());
        System.out.println("Country - "+mercedez.getCountry());
    }
    
   public void objectCreation(){
        
        Car car = new Car();
        
        Car carMercedez =  new Mercedez();
        
        //Mercedez mercedez = new Car(); // left != right
        
    }
}
