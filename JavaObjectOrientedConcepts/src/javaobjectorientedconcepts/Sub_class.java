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
public class Sub_class extends Super_class {
    int num = 10;
    
//    disply mehotd of sub class
    public void display(){
        System.out.println("This is the display method of subclass");
    }
    
    public void my_method(){
        Sub_class sub = new Sub_class();
        
        sub.display();
        
        super.display();
        
        System.out.println("value of the variable named num in sub class :" +sub.num);
        
        System.out.println("value of the variable named num in Super class :" +super.num);
        
    }
}
