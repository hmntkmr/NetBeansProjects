/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoverriding;

/**
 *
 * @author developer
 */
public class Dog extends Animal{

    /**
     *This is overriding a method from class animal 
     */
    @Override
    public void move(){
        System.out.println("Dogs can walk and run");
    }
    
    public void bark(){
        System.out.println("Dogs can bark");
    }
}
