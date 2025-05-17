package tut36;
import java.util.Scanner;
public class quizgame {
    public static void main(String[] args) {
        // JAVA QUIZ GAME

        String[] questions = {
            "What is the main function of the router?",
            "Which part of the computer is considered the brain?",
            "What year was facebook launched?",
            "Who is known as the father of computer?",
            "What was the first programming language?"
        };

        String[][] options = {{"1. Storing files", "2. Envrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. CPU", "2. Memory", "3. Hard Drive", "4. Motherboard"},
                              {"1. 2004", "2. 2005", "3. 2006", "4. 2007"},
                              {"1. Alan Turing", "2. Charles Babbage", "3. Ada Lovelace", "4. Bill Gates"},
                              {"1. Python", "2. Fortran", "3. C++", "4. JavaScript"}
                             };

        int[] answers = {3, 1, 1, 2, 2};
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("WELCOME TO THE JAVA QUIZ GAME!");
        System.out.println("******************************");


        for(int i = 0; i < questions.length; i++){
            System.out.println("Q" + (i+1) + ": " + questions[i]);
            
            for(int j = 0; j < options[i].length; j++){
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your guess (1-4): ");
            guess = sc.nextInt();

            if(guess == answers[i]){
                System.out.println("CORRECT!");
                score++;
            }
            else{
                System.out.println("WRONG!");
            }
        }

        System.out.println("You got " + score + " out of " + questions.length + " questions correct!");

        
        sc.close();

    }
}
