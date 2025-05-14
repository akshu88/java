package tut30;

import java.util.Random;
import java.util.Scanner;

public class diceroll {
    public static void main(String[] args) {

        // JAVA DICE ROLLING PROGRAM 

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.println("Enter the number of dice to roll: ");
        numOfDice = sc.nextInt();

        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(6) + 1; // Generate a random number between 1 and 6
                System.out.println("Debug: roll = " + roll); // Debug statement
                printDie(roll); // Print the dice face
                System.out.println("You rolled: " + roll);
                total += roll; // Add the roll to the total
            }
            System.out.println("Total: " + total);
        } else {
            System.out.println("Number of dice must be greater than 0");
        }

        // Test dice faces individually
        System.out.println("\nTesting individual dice faces:");
        for (int i = 1; i <= 6; i++) {
            printDie(i);
        }

        sc.close(); // Close the scanner
    }

    static void printDie(int roll) {
        System.out.println("Debug: roll = " + roll); // Debug statement
        switch (roll) {
            case 1:
                System.out.println(
                        "---------\n" +
                        "|       |\n" +
                        "|   •   |\n" +
                        "|       |\n" +
                        "---------");
                break;
            case 2:
                System.out.println(
                        "---------\n" +
                        "| •     |\n" +
                        "|       |\n" +
                        "|     • |\n" +
                        "---------");
                break;
            case 3:
                System.out.println(
                        "---------\n" +
                        "| •     |\n" +
                        "|   •   |\n" +
                        "|     • |\n" +
                        "---------");
                break;
            case 4:
                System.out.println(
                        "---------\n" +
                        "| •   • |\n" +
                        "|       |\n" +
                        "| •   • |\n" +
                        "---------");
                break;
            case 5:
                System.out.println(
                        "---------\n" +
                        "| •   • |\n" +
                        "|   •   |\n" +
                        "| •   • |\n" +
                        "---------");
                break;
            case 6:
                System.out.println(
                        "---------\n" +
                        "| •   • |\n" +
                        "| •   • |\n" +
                        "| •   • |\n" +
                        "---------");
                break;
            default:
                System.out.println("Invalid roll");
        }
    }
}