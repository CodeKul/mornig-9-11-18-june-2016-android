/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.innerclasses;

import com.codekul.veryfirstjavaapp.interfaces.GpsListener;

/**
 *
 * @author aniruddha
 */
public class Starter {
    
    
    public void objectOfPublicInnerClass(){
        
        Outer outer = 
                new Outer();
        
        Outer.PublicInner publicInner = 
                outer.new PublicInner();
        
    }
    
    public void objectOfStaticInner(){
        
        Outer.StaticInner staticInner = 
                new Outer.StaticInner();
    }
    
    public void objectOfLoaclInnerClass(){
        
        Outer outer = 
                new Outer();
        outer.outerMethod();
    }
    
    public void whatAboutMyListener(){
        
        Outer outer = 
                new Outer();
        
        Outer.MyListener listener = 
                outer.new MyListener();
        System.out.println("Location is - "+listener.getLocation());;
    }
    
    public void whatIsAnonymusInnerClass() {
        
        GpsListener listerner = new GpsListener() {
            @Override
            public String getLocation() {
                return "sample";
            }
        };
        
        System.out.println("Location is - "+listerner.getLocation());;
    }
    
    public void whatAreTheLambdas(){
        
        GpsListener listener = () -> "Hello world"; //lmbadas
        
        listener = this::myStr; // method references
    }
    
    public String myStr(){
        
        return "hello";
    }
}
