/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencapsulation;

/**
 *
 * @author developer
 */
public class JavaEncapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * =========Encapsulation is one of four fundamental OOP concepts.
         * Other than Inheritance, polymorphism and abstraction
         * 
         * Encapsulation in Java is a mechanism of wrapping the data (variables)
         * and code acting on the data (Methods) together as a single unit
         * In encapsulation, the variables of a class will be hidden from other classes, can be accessed through the methods of their current class 
         * 
         * It is also known as data hiding
         * 
         * To achieve encapsulation in Java
         * Declare the variables of class as private
         * provide public setter and getter methods to modify and view the
         * variables values
         */
        
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIDNum("123ms");
        
        System.out.println("Name : " +encap.getName() + " Age : " +encap.getAge());
        
        /**
         * The fields of a class can be made read-only or write-only.

A class can have total control over what is stored in its fields.

The users of a class do not know how the class stores its data. A class can change the data type of a field and users of the class do not need to change any of their code.


         */
    }
    
}
