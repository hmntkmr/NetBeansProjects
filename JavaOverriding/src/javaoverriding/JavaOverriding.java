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
public class JavaOverriding {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * =======Overriding
         * we can inherit a methods from various superclass 
         * there is a chance to override the method provided that is not marked final
         * 
         * Benefit. 
         *  Ability to define a behavior that's specific to the subclass type, 
         * which means a subclass can implement a parent class method based on its requirement
         */
        
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog();    // Animal reference but Dog object
        
        a.move();  // runs the method in Animal class
        b.move();  // runs the method in Dog class
//        b.bark();
        
        /**
         * In the above example, you can see that even though b is a type of Animal it runs the move method in the Dog class. 
         * The reason for this is: In compile time, the check is made on the reference type. 
         * However, in the runtime, JVM figures out the object type and would run the method that belongs to that particular object.
         */
    
        /**
         * Rules for Method Overriding
         * The argument list should be exactly the same as that of the overridden method.The return type should be the same or a subtype of the return type declared
         * in the original overridden method in the superclass.
         * The access level cannot be more restrictive than the overridden method's access level. For example: If the superclass method is declared public then the overridding method in the sub class cannot be either private or protected.
         * Instance methods can be overridden only if they are inherited by the subclass.
         * A method declared final cannot be overridden.
         * A method declared static cannot be overridden but can be re-declared.
         * If a method cannot be inherited, then it cannot be overridden.
         * A subclass within the same package as the instance's superclass can override any superclass method that is not declared private or final.
         * A subclass in a different package can only override the non-final methods declared public or protected.
         * An overriding method can throw any uncheck exceptions, regardless of whether the overridden method throws exceptions or not. However, the overriding method should not throw checked exceptions that are new or broader than the ones declared by the overridden method. The overriding method can throw narrower or fewer exceptions than the overridden method.
         * Constructors cannot be overridden.
         */
    
    }
}
