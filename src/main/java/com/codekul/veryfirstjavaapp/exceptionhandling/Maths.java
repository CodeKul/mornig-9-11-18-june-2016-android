/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.exceptionhandling;

/**
 *
 * @author aniruddha
 */
public class Maths {
    
    public void division(int num1, int num2) throws ArithmeticException{
        
        /*try {
            System.out.println("Division is - "+(num1/num2)); // throw new ArithmaticException
        } catch (Exception e) {
            System.out.println("Division is zero");
            System.out.println("Exception Occured - "+e.getMessage());
        }*/
        
        System.out.println("Division is - "+(num1/num2)); // throw new ArithmaticException
    }
    
    public void addition(int num1, int num2){
        
        if(num1 > 40) throw new MyException();
        
        System.out.println(""+(num1+num2));
    }
}
