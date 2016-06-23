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
public class Starter {
    
    public void whatIsException(){
        
        Maths maths = new Maths();
        
        try {
            maths.division(10, 20);
        } catch(ArithmeticException e){
            System.out.println("Arirthmatic Excception occured for dividing 10 / 20");
        }
        catch (Exception e) {
            System.out.println("Excception occured for dividing 10 / 20");
        }
        finally{
            System.out.println("Finally will execute all the time");
        }
        

        try {
            maths.division(10, 0); // terminate the program
        } 
        catch(ArithmeticException e){
            System.out.println("Arirthmatic Excception occured for dividing 10 / 0");
        }
        catch (Exception e) {
            System.out.println("Excception occured for dividing 10 / 0");
        }
        catch (Throwable e) {
            System.out.println("Excception occured for dividing 10 / 0");
        }
    }
    
    public void howShouldICreateCustomException(){
        
        Maths maths = new Maths();
        try {
            maths.addition(50, 10);
        } catch(MyException e){
            System.out.println("Custom Exception"+e.getMessage());
        }
        catch (Exception e) {
        }
        
        maths.addition(10, 50);
    }
}
