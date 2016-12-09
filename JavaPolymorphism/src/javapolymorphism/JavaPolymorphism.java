/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapolymorphism;

/**
 *
 * @author developer
 */
public class JavaPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * ======Polymorphism 
         * it is the ability of an object to take on many forms.
         * 
         * The most common use of polymorphism in OOP occurs 
         * when a parent class reference is used to refer to a child class object
         * 
         * Any java object that can pass more than one IS-A test is considered 
         * to be polymorphic. All java objects are polymorphic since any object
         * will pass the IS-A test for their own type and for the class object
         * 
         * Only possible way to access and object is  through a reference variable.
         * A reference variable can be of only one type. 
         * once declared the type of reference variable can not be changed
         * 
         * 
         * ========example===========
         * public interface Vegetarian{}
         * public class Animal{}
         * public class Deer extends Animal implements Vegetarian{}
         * 
         * Deer class is considered to be polymorphic 
         * Deer is a animal
         * deer is a vegetarian
         * deer is a deer
         * deer is a object
         * 
         * 
         */
        
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        
        /**
         * Here, we instantiate two Salary objects. 
         * One using a Salary reference s, and the other using an Employee reference e.
         */
        
        System.out.println("Call mailCheck using Salary reference --");   
        
        s.mailCheck();
        /**
         * While invoking s.mailCheck(), 
         * the compiler sees mailCheck() in the Salary class at compile time, 
         * and the JVM invokes mailCheck() in the Salary class at run time.
         */
        
        System.out.println("\nCall mailCheck using Employee reference--");
        
        e.mailCheck();
        
        /**
         * mailCheck() on e is quite different because e is an Employee reference. 
         * When the compiler sees e.mailCheck(), 
         * the compiler sees the mailCheck() method in the Employee class.
         */
        
        /**
         * Here, at compile time, the compiler used mailCheck() 
         * in Employee to validate this statement. 
         * At run time, however, the JVM invokes mailCheck() in the Salary class.
         * This behavior is referred to as virtual method invocation, 
         * and these methods are referred to as virtual methods. 
         * An overridden method is invoked at run time, 
         * no matter what data type the reference is that was used in the 
         * source code at compile time.
         */
        
    }
    
}
