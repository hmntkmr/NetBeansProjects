/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaabstraction;

/**
 *
 * @author developer
 */
public class JavaAbstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Following is not allowed and would raise error */
      Employee e = new Salary("George W.", "Houston, TX", 43, 222.8);
      Salary s = new Salary("John Adams", "Boston, MA", 2, 75000.00 );
      System.out.println("\nCall mailCheck using Employee reference--");
      e.mailCheck();
      System.out.println("\nCall mailCheck using Employee reference--");
      s.mailCheck();
      System.out.println("Your hourly rate is: $"+Math.round(s.computePay()));
    }
    
}
