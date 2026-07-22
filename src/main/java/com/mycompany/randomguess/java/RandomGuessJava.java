/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomguess.java;

/**
 *
 * @author 24028240
 */
import javax.swing.JOptionPane;
public class RandomGuessJava {

    public static void main(String[] args) {
        JOptionPane.showInputDialog("Enter any number from 1 to 10");
        JOptionPane.showMessageDialog(null, "Number is " + (1 + (int)(Math.random() *10 ) ) );    
      
        
    }
   
  
}
