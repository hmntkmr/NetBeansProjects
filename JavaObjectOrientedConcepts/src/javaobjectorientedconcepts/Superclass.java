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
public class Superclass {
    int age;
    
    Superclass(int age){
        this.age = age;
    }
    
    public void getAge(){
        System.out.println("The value of the variable named age in super class is: " +age);
    }
}
