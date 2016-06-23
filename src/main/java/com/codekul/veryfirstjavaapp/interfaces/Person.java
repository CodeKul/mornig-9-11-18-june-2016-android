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
public class Person implements GpsListener{

    private String name;
    private int age;
    
    public void whatsUrName(){
    
        System.out.println(""+name);
    }
    
    public void whatsUrAge(){
        
        System.out.println(""+age);
    }

    @Override
    public String getLocation() {
        
        return "In office";
    }
}
