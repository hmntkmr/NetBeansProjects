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
public class This_Example {
    
    int num = 10;
    
    This_Example(){
        System.out.println("This is an example program on keyword this");
    }
    
    This_Example(int num){
        this();
        
        this.num = num;
    }
    
    public void greet(){
        System.out.println("Hi welcome to Tutorialspoint");
    }
    
    public void print(){
        int num = 20;

//        printing the instance variable
        System.out.println("Value of local variable is : " +num);
//        Printing the local variable
         System.out.println("Valur of instance variable is : " +this.num);
         
         this.greet();
    }
}
