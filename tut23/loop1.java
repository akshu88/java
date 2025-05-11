package tut23;

import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) throws InterruptedException {
       /*  
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter how many times you want to loop: ");
       int max = sc.nextInt();

       for(int i = 1; i <= max; i++){
        System.out.println(i);

       }
      */


      Scanner sc = new Scanner(System.in);


      System.out.println("How many seconds to countdown from?: ");
      int start = sc.nextInt();

      for(int i = start; i > 0 ; i--){
        System.out.println(i);
        Thread.sleep(1000);
      }

      System.out.println("HAPPY NEW YEAR!");
    }
}