package game1;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {

        // MAD LIBS GAME

        Scanner sc = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjecitve3;
 
 
        System.out.print("Enter an adjective(description):");
        adjective1 = sc.nextLine();
        System.out.print("Enter a noun(animal or person):");
        noun1 = sc.nextLine();
        System.out.print("Enter an adjective(description):");
        adjective2= sc.nextLine();
        System.out.print("Enter a verb end with -ing (action):");
        verb1= sc.nextLine();
        System.out.print("Enter an adjective(description):");
        adjecitve3= sc.nextLine();
 
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit ,I saw a " + noun1 + ".");
        System.out.println(noun1 +" was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjecitve3 + "!");
        
     }
}
