package tut37;
import java.util.Scanner;
import java.util.Random;

public class rockpapersissgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            playerChoice = sc.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));

        System.out.println("Thanks for playing! Goodbye.");
        sc.close();
    }
}