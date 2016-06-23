/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.langbasics;

/**
 *
 * @author aniruddha
 */
public class Physics {
    
    public Physics(){
        
    }
    
    public Physics(double mass){
        
    }


    public Physics(double mass, double speed){
        
    }

    public void calculateEnergy() {

        double energy = 100 * (3.14 * 3.14);
        System.out.println("Energy is - " + energy);
    }

    public void calculateEnergy(double mass) {

        double energy = mass * (3.14 * 3.14);
        System.out.println("Energy is - " + energy);
    }

    public void calculateEnergy(double mass,double speedOfLight) {

            double energy = mass * (speedOfLight * speedOfLight);
            System.out.println("Energy is - " + energy);
            //49117700
    }        
}
