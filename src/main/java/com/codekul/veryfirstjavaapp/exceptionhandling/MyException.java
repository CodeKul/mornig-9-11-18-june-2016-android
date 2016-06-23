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
public class MyException extends RuntimeException{

    public MyException() {
        super();
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "It is custom exception"; 
    }
}
