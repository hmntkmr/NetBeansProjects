/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjavafromtutorialspoint;




/**
 *
 * @author developer
 */
public class Dog {
    
    String breed;
    int ageC;
    String color;
    String name;
    
    void barking(){ System.out.println("Dog is Barking");}
    void hungry(){ System.out.println("Dog is Hungry");}
    void sleeping(){ System.out.println("Dog is Sleeping");}
    
    void name(){ System.out.println("Passed Name is:" +name);}
    
    void displayAge(String name, int ageC){ System.out.println(name + " is " +ageC+ " Years old!");}
}


/*
    =================
    Variables in Java
    =================

    Local variables:
        - Variables defined inside methods, constructors or blocks are called local variables.
        - Variables will be be declared and initialized within the method and variable will be          destroyed when themethod is completed
    Instance Variables:
        - Variables inside the class but outside any method
        - variables are initialized when the class is instatiated 
        - instance variables can be accessed frm inside any method, constructor or blocks of that particular class
    Class variables
        - Variables declared within a class, outside any method, with static keyword.


*/
