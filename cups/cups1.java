package cups;
import java.util.Scanner;
public class cups1 {
    public static void main(String[]agrs){
 //       System.out.println(Math.PI);
 //       System.out.println(Math.E);
/* 
         double result;
         result = Math.pow(2,3);
         result = Math.abs(-5);
         result = Math.sqrt(9);
         result = Math.round(3.14);
         result = Math.ceil(3.14);   // basically it round off the number upwards
         result = Math.floor(3.99);  // basically it round off the number downwards
         result = Math.max(10,20);
         result = Math.min(10,20);
          

         System.out.println(result);
         */

/* 
         // HYPOTENUSE c = Math.sqrt(a^2+ b^2)

         Scanner sc = new Scanner(System.in);
         double a;
         double b;
         double c;

         System.out.println("Enter the length of side A: ");
         a = sc.nextDouble();

         System.out.println("Enter the  length of side B: ");
         b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hypotenuse (side c) is: " + c + "cm");
*/

        
        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.pow(radius, 3);

        Scanner sc = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();    
        
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius ,3);


        System.out.println("The circumferene is: " + circumference + "cm");
        System.out.println("The area is: " + area + "cm^2");
        System.out.println("The volume is: " + volume + "cm^3");

    }
}
