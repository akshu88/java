package tut22;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        

        // NUMBER GUESSING GAME 

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n ", min ,max);

        do{
            System.out.print("Enter a guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("TOO LOW! try again");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH! try again");
            }
            else{
                System.out.println("CORRECt! The nummber was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }


        }while(guess != randomNumber);

       
    }
}
