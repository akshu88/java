package tut21;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        

        // while loop = repeat some code forever
        //              while some condition remains true

        Scanner sc = new Scanner(System.in);

        /* example 1

        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }

        System.out.println("Hello " + name);

        */

        /* example 2
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game ");
            System.out.println("Press Q to quit: ");
            response = sc.next().toUpperCase();
        }

        System.out.println("You have quit the game");

        */


        /*example 3 

        int age = 0;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        while(age < 0 ){
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = sc.nextInt();

        }

        System.out.println("You are " + age + " years old");

        */

        /* do while 

        int age = 0;

        do{
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = sc.nextInt();

        }while(age < 0 );

        System.out.println("You are " + age + " years old");
        */

        /* example 4 */

        int number = 0;

        do{
            System.out.print("Enter a number between 1-10: ");
            number = sc.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked " + number);
    }

}
