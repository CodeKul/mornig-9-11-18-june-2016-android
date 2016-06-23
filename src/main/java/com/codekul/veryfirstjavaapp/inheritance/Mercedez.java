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
public class Mercedez /*is a Car*/
        extends Car{
    
    private String country; // car will never have country

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override // annotation
    public void speedUp() {
        super.speedUp(); 
        
        System.out.println("speeding up in mercedez");
    }
}
