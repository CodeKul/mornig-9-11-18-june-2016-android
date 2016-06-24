/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.veryfirstjavaapp.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aniruddha
 */
public class Starter {

    public void howShouldICreateTheFile() {

        File file
                = new File("/home/aniruddha/Desktop/my.txt");
        try {
            System.out
                    .println(file.createNewFile()
                            ? "File created"
                            : "problem in creation of file");
        } catch (IOException ex) {
            System.out.println("" + ex);
        }
    }

    public void whatIsFileWriter() {

        File file
                = new File("/home/aniruddha/Desktop/my.txt");

        try {
            FileWriter writer
                    = new FileWriter(file);
            writer.write("Hello World using writer");
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void whatIsFileOutputStream(){
        
        File file
                = new File("/home/aniruddha/Desktop/my.txt");
        
        try {
            FileOutputStream fos =
                    new FileOutputStream(file);
            
            fos.write("Hello world using output stream".getBytes());
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger
                    .getLogger(Starter.class
                            .getName())
                    .log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void whatIsFileInputStream(){
        
        File file
                = new File("/home/aniruddha/Desktop/my.txt");
        
        try {
            FileInputStream fis =
                    new FileInputStream(file);
            
            String fileData = new String();
            while(true){
                
                int ch = fis.read();
                if(ch == -1) break;
                else fileData = fileData + (""+(char)ch);
            }
            
            System.out.println("Read File - "+fileData);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Starter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
