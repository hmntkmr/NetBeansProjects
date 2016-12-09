/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjavafromtutorialspoint;

/*
 *
 * @author developer
 */

//Package : it is a way of categorizing the classes and interfaces.
//hundereds of classes and interfaces will be written, therefore categorizing these classes is a must as well as makes life much easier


//Import statements
/*
    import java.io.*;
    Import statement is a way of giving the proper location for compiler to find the paricular class
*/

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;




public class LearnJavaFromTutorialsPoint {

    /*
    ******************************
    Java Tutorials Point Core Java
    ******************************
    
    ============
    Introduction
    ============

    Java is Object Oriented 
        - everything is an object. 
        - can be extedned easily because of its object based model
    
    Platform Independednt 
        -
    Secure
        - enables to develop virus-free, tamper-free systems
        -authentication techniques are based on public-key encryption
    
    Architecture-neutral
        - generates an architectrure-neutral object file format, 
        - compiled code executables on many processors, with the preseene of java runtime system
    
    Portable
        - no implementation dependent aspects of the spceification makes it portable 
    
    Robust
        - Makes an effort to eliminate error prone situations by emphasizing mainly on complike time erros checking and runtime checking
    
    Multithreaded
        - makes it posible to write programs that can perform many tasks simultaneously
        - allows developers to construct interactive application that can run smoothly
    
    Interpreted
        - Java byte code is translated on the fly to native machine instrucitons 
        - is not stored anywhere
        - development process is more rapid and analytical since the linking is an incremental and light-weight process
    
    High Performance
        - Just in time compilers, Java enables high performace
    
    Distributed
        -designed for distributed environment of the internet
    
    Dynamic
        - More dynamic than c or C++, because it is designed to adapt to an evolving environment. 
        - Can carry extensive amount of runtime information thatn can be used to verify and resolve access to objects on run-time
    
    =========
    Chapter 1
    =========

    Object
        - Objects have states and behaviours.
        - An object is an instance of a class
    
    Class
        - Can be defined as a template/bluepring that describes the behaviour
        - State that the object of its type supports
    
    Methods
        - It is baiscaly a behaviour 
        - A class can contain many methods
        - In methods we write logics, data manupulated and all the actions are executed
    
    Instance Variables
        - each object has it unique set of instace variables
        - an object stat is created by the values assigned to thoese instace variables
    
    ============
    Basic Syntax
    ============
    
    Case sensitivity
        - Java is case sensitve
    
    ClassNames 
        - first letter of all class names should be upper case 
        - if several worlds use then we can use camelcase
    
    Method Names
        - All method names should start with lower case letter
        - is several words use then we can use camel case
    
    Program file Name
        - Name of the program file should exavtyly match the class name
    
    public static void main(String args[])
        - program processing starts from the main() method which is mandatory part of evey Java Program
    
    ================
    Java Identifiers
    ================
    
    All java components require names. 
    Names used for classes, variables and methods are called identifiers
    
        - All identifiers should begin with a letter (A to Z of a to z)
        - Currency character ($) or and underscore(_)
        - A keyword can not be used an an identifier
        - Identifiers are case sensitive
        examples
            Legal 
                - age, $salary, _value, __1_value
            Illegal
                - 123abc, -salary
    
    ==============
    Java Modifiers
    ==============
    
    It is possible to modifiy classes, methods, etc., 
        Access Modifiers - default, public, protected, private
        Non-access Modifiers - final, abstract, strictfp

    ==============
    Java Variables
    ==============
    
        - Local Variables 
        - Class Variables (static variables)
        - Instance variables (non-static variables)
    
    
    ===========
    Inheritance
    ===========
        - CLasses can be derived from classes. 
        - if a class that has some of the code you require, then it is possible to derive your new class from the already exisiting code
        - This concept allows you to reuse the fields and methods of existing class without having to rewrite the code in a new class
        - existing class is called the superclass
        - derived class is called the subclass
    
       
    
    
    
        ==========
        Interfaces
        ==========
    
        - interface can be defined as a contract between objects on how to communicate with each other
        - interface plays a vital role when it comes to the concept of inheritance
        - An interface defines the methods, a deriving class should use
        - but the inplementation of methods is totally up to the subclass
    
  
    
    
        =========================
        Java - Object and Classes
        =========================
        -   Java is an object-oriented language
        -   As a language that has the object-orineted features
        -   POLYMORPHISM
            INHERITANCE
            ENCAPSULATION
            ABSTRACTION
            CLASSES
            OBJECTS
            INSTANCE
            METHOD
            MESSAGE PARSING
    
        -OBJECTS
            have states and behaviours  
            
        ========================================
        Accessing Instance Variables and Methods
        ========================================
        First create an object
        ObjectReference = new Constructor();
    
        Now call a variable as follows
        ObjectReference.variableName;
    
        Now you can call a class method as follows
        ObjectReference.MethodName();
    
    /*    
    *
    * @param args the command line arguments
    *
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
      
/*
        System.out.println("Helo World!");
        // example of enum
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
        System.out.println("Size: " +juice.size);

        // example of object creation, accessing methods and variables in the class
        Dog action = new Dog();
        
        action.barking();
        action.hungry();
        action.sleeping();
        action.displayAge("Golden", 3);
        
        //use of import keyword and java.io.*
        
        //Objects creating using cunstroctor
        
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");
        
//      Invoking methods for each object
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(4000.00);
        empOne.printEmployee();
        
        empTwo.empAge(21);
        empTwo.empDesignation("Junior Software Engineer");
        empTwo.empSalary(4000.00);
        empTwo.printEmployee();
*/

/*
    ======================
    Java - Basic Datatypes
    ======================

     Variables are nothing but reserved memory locations to store values
     
     Based on data type of a variable, the operating system allocates memory and decides what can be stored in the reserved memory
     --------------------
     Primitive Data Types
     --------------------
        byte - 8bit signed two's complement integer
             - Minimum value is -128 (-2^7)
             - Maximum value is 127 (2^7 -1)
             - Default value is 0
        
        short - 16bit signed two's comlement integer
              - Minimum value is -32,786(-2^15)
              - Maximum value is 32,767(2^15 -1)
              - Default value is 0
        
        int - 32bit signed two's complement integer
            - Minimum value is - 2,147,483,648 (-2^31)
            - Maximum value is 2,147,483,647(2^31 -1)

        long - 64bit signed two's complement integer
             - Minimum value is -9,223,372,036,854,775,808(-2^63)
             - Maximum value is 9,223,372,036,854,775,807 (inclusive)(2^63 -1)
             - Default value is oL

        float - is a single precision 32-bit IEEE 745 floating point 
              - mainly used to save memory in large arrays of floating point numbers
              - default value is 0.0f
        
        Double - is a double precision 64 bit IEEE 754 floating point 
               - mainly used as the default data type for decimal values, generally the default choice
        
        boolean - represent one bit of information
                - only two possible values : true and false
                - default value is false
        
        char - is a single 16-bit unicode character
             - minium value is 0
             - maximum value is 65,535
             - used to store any character

    ===================   
    Reference Datatypes
    ===================
        Reference variables are created using defined constructors of classes
        They are used to accesss objects
        These vaiables are declared to be of a specific type that can not be changed
        Class objects and various type of array variables come under reference data type
    
    =========
    Variables
    =========
        ---------------
        Local Variables
        ---------------
        - are declared in methods, constructors, or blocks
        - access modifiers can not be used for local variables
        - local variables are visible only within declared method, constructor, or block
        - local variables are implemented at stack level internally
        - no default value for local variables
        
        ------------------
        Instance Variables
        ------------------
            - declared inside a class but outside method, constructor or any block
            - IV are created when an object is created with the use of keyowod new and destroyed when the object is destroyed
            - Instance variables hold values that must be referenced by more than one method
            - IV can be declared in class level before or after use
            - Access modifieres can be given for instance variables
            - visible to all the methods, constructors and block inthe class
            - it is recomended to make these variable private access level
        
        ----------------------
        Class/Static Variables
        ----------------------
            - class variables also know as static variables are declared with the static keyword in a class, but outside a method, constructor or a block
            - There would be only one copy of each class variable per class, regardless of how many objects are created from it. 
            - static variables are rarely used other than being declared as constants
            - Constants are variables that are declared as public/private, final and static
            - Constant variables never change from their initial value
            - created when the program starts and eetroyed when the program stops
            - most static variables are created when the program starts and destroyed when the program stops
            - Static variables can be accessed by calling withthe class name 
*/


/* 
        // USE OF   STATIC, PRIVATE KEYWORD IN JAVA

    Employee empOne = new Employee("Jhon Doe");
    
    Employee.salary = 4555.0;
    
    System.out.println(Employee.DEPARTMENT+ " Average Salry: " +Employee.salary);

*/

/*
    =============JAVA - MODIFIER TYPES===============
    
    Modifiers are keywords that you add to those definitions to change their meanings
    to use modifiers, include its keyword in the definition of a class, method, or variable
    the modifier proceds the rest of the statement 
    
    ==========Access Control Modifers===========================
    
    Java Provides a number of access modifiers to set access levels for classes, variables, methods and constructors. 
       
    1 VISIBLE TO THE PACKAGE, THE DEFAULT. NO MODIFIERS NEEDED
    2 VISIBLE TO THE CLASS ONLY (PRIVATE)
    3 VISIBLE TO THE WORLD (PUBLIC)
    4 VISIBLE TO THE PACKAGE AND ALL SUBCLASSES (PROTECTED)

    =============NON-ACCESS MODIFIERS====================
    JAVA PROVIDES A NUMBER OF NON ACCESS MODIFIERS TO ACHIEVE MANY OTHER FUNCTIONALITY
    
    THE STATIC MODIFIER FOR CREATING CLASS METHODS AND VARIABLES
    THE FINAL MODIFIER FOR FINALIZING THE IMPLEMENTATIONS OF CLASSES, METHODS, AND VARIABLES
    THE ABSTRACT MODIFIER FOR CREATING ABSTRACT CLASSES AND METHODS
    THE SYNCHRONOZIED AND VOLITILE MODIFIER FORS THREADS
    
*/

//    String [] names = {"Hemant", "Kumar", "Tom", "Lacy" };
    
//    ============Number Class============= Integer
    
//    Integer x = 5;
//    ========xxxxValue()
//    System.out.println(x.byteValue());
//    System.out.println(x.doubleValue());
//    System.out.println(x.longValue());
//    
    
//    ===========compareTo()
//If the Integer is equal to the argument then 0 is returned.
//If the Integer is less than the argument then -1 is returned.
//If the Integer is greater than the argument then 1 is returned.
    
//    System.out.println(x.compareTo(5));
//    System.out.println(x.compareTo(3));
//    System.out.println(x.compareTo(7));
//    
//    ==========round()
    
//    System.out.println(Math.round(x));
//    
//    for ( String name : names){
//        System.out.print(name);
//        System.out.print(",");
//    }

//    ===============String
    
//    char[] helloArray = {'h','e','l','l','o','.' };
//    
//    String helloString = new String(helloArray);
//    String helloWorld = "World!";
//    System.out.println(helloString + helloString.length());
//    String concat = helloString.concat(helloWorld);
//    System.out.println(concat);

//    =================Array
      
//      arrayRefVar = new dataType[arraySize];
/*
        double[] myList = {1.9, 2.9, 3.4, 3.5};
//        It creates an array using new dataType double 

//  =======printing all elements of an array
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }
//  =======summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is" +total);
        
//  ========Finding the largest element
    double max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
         }
         System.out.println("Max is " +max);
        }
    
*/
    
//   ==============Date 
    /*
        Java provides the date class availabe in java.util package. this class encapsulates the current date and time
    */
    
   /*
    Date date = new Date();
    
    System.out.println(date.toString());
    
    SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
    
    System.out.println(ft.format(date) + "Current Date:");
    */
//   ============method overlaoding

//    int a = 11;
//    int b = 6;
//    double c = 7.3;
//    double d = 9.4;
//    int result1 = minFunction(a, b);
//      
//      // same function name with different parameters
//      double result2 = minFunction(c, d);
//      System.out.println("Minimum Value = " + result1);
//      System.out.println("Minimum Value = " + result2);
//   }
//
//   // for integer
//   public static int minFunction(int n1, int n2) {
//      int min;
//      if (n1 > n2)
//         min = n2;
//      else
//         min = n1;
//
//      return min; 
//   }
//   
//   // for double
//   public static double minFunction(double n1, double n2) {
//     double min;
//      if (n1 > n2)
//         min = n2;
//      else
//         min = n1;
//
//      return min; 
//   }
    
//    =============this keyword
    /*
    ========this keyword
    in java which is used as a reference to the object of the current class, with an instnace method or a constructor. 
you can refer the members of a class such as constructors, variables and methods.
    the keyword this is used to 
        - differentiate the instance variables from local variables if they have smae names
        - within a constructor or a method
        
    */
    
    This_Example obj1 = new This_Example();
    
    obj1.print();
    
    This_Example obj2 = new This_Example(30);
    
    obj2.print();
    }
}    

    