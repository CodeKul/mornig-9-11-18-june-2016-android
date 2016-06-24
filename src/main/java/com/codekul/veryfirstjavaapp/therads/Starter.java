/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.therads;

/**
 *
 * @author aniruddha
 */
public class Starter {
    
    public void createThreadUsingSubclass(){
        
        MyThread thread = 
                new MyThread(); // dormant
        thread.setDaemon(true);
        thread.start();
    }
    
    public void createThreadUsingRunnable(){
        
        Thread thread = 
                new Thread(new MyRunnable());
        thread.start();
        
        Thread threadAnonymus = 
                new Thread(new Runnable() {
            @Override
            public void run() {
                
                for(int i = 0; i < 10; i++){
                    
                    System.out.println(" Runnable - "+i);
                }
            }
        });
        threadAnonymus.start();
    }
}
