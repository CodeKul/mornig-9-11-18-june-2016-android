/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp;

import com.codekul.veryfirstjavaapp.exceptionhandling.Starter;



/**
 *
 * @author aniruddha
 *
 */
public class Main {
    
    public static void main(String[] args) {
       
        Starter starter = 
                new Starter();
        starter.howShouldICreateCustomException();
   }
}
