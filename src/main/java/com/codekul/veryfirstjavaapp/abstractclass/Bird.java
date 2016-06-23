/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.abstractclass;

/**
 *
 * @author aniruddha
 */
public abstract class Bird {

    public abstract void fly();
    
    public abstract void walk();
    
    public void legs(){
        System.out.println("2 legs");
    }
}
