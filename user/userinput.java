package user;
import java.util.Scanner;

public class userinput {
    public static void main(String[]args){

        //COMMON ISSUES

        /* 
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your favourite color: ");
        String color=sc.nextLine();

        System.out.println("You are " + age + " years old");
        System.out.println("You like the color " + color);

        */


        // Calculate area of a rectangle 
        
        Scanner sc = new Scanner(System.in);
        double length = 0 ;
        double width = 0 ;
        double area = 0 ;

        System.out.println("Enter the length: ");
        length= sc.nextDouble();
        System.out.println("Enter the width: ");
        width= sc.nextDouble();
        area=length*width;
       // area=sc.nextDouble();
        
        System.out.println("Area is : " + area + "cm");

    }
}
