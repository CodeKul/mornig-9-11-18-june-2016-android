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
public class Outer {

    // class inside class
    
    public class PublicInner {
        
    }
    
    private class PrivateInner {
        
    }
    
    public static class StaticInner {
        
    }
    
    public void outerMethod(){
        
        final class LocalInner {
            
        }
        
        LocalInner inner = 
                new LocalInner();
    }
    
    public class MyListener 
            implements GpsListener {

        @Override
        public String getLocation() {
            return "Sample";
        }
    }
}
