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
public /*abstract*/ class BiCycle implements GpsListener{
    
    private int rpm;

    public int getRpm() {
        return rpm;
    }
    
    public void applyBreaks(){
        rpm -= 5;
    }

    @Override
    public String getLocation() {
        return "On ground";
    }
}
