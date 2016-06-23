/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.inheritance;

import com.codekul.veryfirstjavaapp.abstractclass.Bird;

/**
 *
 * @author aniruddha
 */
public /*abstract*/ class PeaCock extends Bird{

    @Override
    public void fly() {
        System.out.println("PeaCock is flying");
    }

    @Override
    public void walk() {
        System.out.println("PeaCock is walking");
    }
    
    public void jump(){
        
    }
}
