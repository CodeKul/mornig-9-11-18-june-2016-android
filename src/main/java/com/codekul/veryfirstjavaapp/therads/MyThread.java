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
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run(); 

        int i =0;
        while(i < 50){
            i++;
            System.out.println("my Thread"+i);
        }
    }
}
