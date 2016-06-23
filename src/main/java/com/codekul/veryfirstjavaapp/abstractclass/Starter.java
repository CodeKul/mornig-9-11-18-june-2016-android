/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.abstractclass;

import com.codekul.veryfirstjavaapp.inheritance.PeaCock;

/**
 *
 * @author aniruddha
 */
public class Starter {
    
    public void whatIsAbstractClass(){
        
        Bird bird = 
                new PeaCock();
        bird.fly();
        
        //bird.jump();
        
        PeaCock peaCock = new PeaCock();
        peaCock.jump();
        
    }
}
