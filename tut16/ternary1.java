package tut16;

import java.util.Scanner;

public class ternary1 {
    public static void main(String[] args) {
        

        // ternary operator ? = Return 1 or 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

      // int score = 75;

       //String passOrFail = (score >= 60) ? "PASS" : "FAIL";

       //System.out.println(passOrFail);


     //  int number = 10;

       //String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD" ;

       //System.out.println(evenOrOdd);


      // int hours = 12;
       
      // String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

       //System.out.println(timeOfDay);

       int income = 30000;

       double taxRate = (income >= 40000) ? 0.25 : 0.15;

       System.out.println(taxRate);
    }
}
