/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaobjectorientedconcepts;

/**
 *
 * @author developer
 */
public class Calculation {
    int z;
    
    public void addition(int x, int y){
        z = x + y;
        System.out.println("The sum of the given numbers: "+z);
    }
    
    public void subtraction(int x, int y){
        z = x - y;
        System.out.println("The difference between the given numbers: " +z);
    }
}

