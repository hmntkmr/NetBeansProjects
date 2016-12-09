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
public class JavaObjectOrientedConceptsInheritance {

    /**
     * @param args the command line arguments
     */
    
    
    /**
     *============Inheritance
     * Inheritance can be defined as the process where one class acquires the properties of another
     * with the use of inheritance information is made manageable in hierarchical order
     * 
     * the class which inherits the properties known as subclass(derived class or child class
     * the class whose properties are inherited is known as super class(base class, parent class)
     *============extends keyword 
     * extends is the keyword used to inherit the properties of a class
     * 
     * 
     * @param args
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 20, b = 30;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.subtraction(a,b);
        demo.multiplication(a, b);
        
        /**
        * ========Super Keyword===========
        * 
        * super keyword is similar to this keyword
        * it is used to differentiate the members of superclass
        * if they have same names
        * 
        * it is used to invoke the superclass constructor from subclass
        * 
        * ===========Sample Code========
        * 
       */
        
        Sub_class obj = new Sub_class();
        obj.my_method();
        
        /**
         * ===========Invoking superclass constructor
         * 
         * if a class is inheriting the properties of another class, the subclass automatically requires the default constructor of superclass.
         * if you want to call a parameterized constructor of the superclass, 
        */
        
        Subclass s = new Subclass(24);
        s.getAge();
        
        /**
         * ======IS-A RELATIONSHIP
         * is a is a way of saying: this object is a type of that object. 
         * 
         * public class Animal{
         * 
         * }
         * public class Mammal extends Animal{
         * 
         * }
         * public class Reptile extends Animal{
         * 
         * }
         * public class Dog extends Mammal{
         * 
         * }
         * 
         * Animal is super class of Mammal 
         * Animal is a super class of Reptile 
         * Dog is a sub class of mammal and animal 
         * 
         * Mammal IS-A Animal
         * Reptile IS-A Animal 
         * Dog IS-A Mammal
         * Dog IS-A Animal as well
         */
        
        
        
        Animal some  = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();
        
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
        System.out.println(some instanceof Dog);
        
        /**
         * ===========instanceof
         * instaceof operator basically checks and verifies the relation between the classes
         */
        
        
        /**
         * =========HAS-A RELATIONSHIP
         * these relationships mainly based on the usage.
         * determines whether a certain class HAS-A certain thing.
         * this relationship helps to reduce duplication of code as well as bugs
         * 
         * public class Vehicle{}
         * public class Speed{}
         * 
         * public class Van extends Vehicle{
         *  private Speed sp;
         * }
         */
        
        /**
         * =========Types of Inheritance
         * Various types.
         * SIngle Inheritance Public class B extends A{}
         * Multilevel inheritance public class B extends A{} public class C extends B{}
         * Hierarchical inheritance public class A{} public class B extends A{} public class C extends A{}
         */
    }
}
