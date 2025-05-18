package tut38;
import java.util.Random;
import java.util.Scanner;
public class slotmachine {
    public static void main(String[] args) {
        //JAVA SLOT MACHINE


        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain = "yes";


        System.out.println("***************************************");
        System.out.println("Welcome to Java Slots!");
        System.out.println("Symbols: :), BAR, BELL, CHERRY, LEMON");
        System.out.println("***************************************");


        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.println("Enter your bet amount: ");
            bet = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            if(bet > balance) {
                System.out.println("Insufficient funds. Please enter a lower bet.");
                continue;
            }
            else if(bet <= 0) {
                System.out.println("Bet must be greater than 0.");
                continue;
            }
            else {
                balance -= bet;
            }

            System.out.println("Spinning the slot machine...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row,bet);



            if(payout > 0) {
                System.out.println("Congratulations! You won $" + payout);
                balance += payout;
            }
            else {
                System.out.println("Sorry, you lost your bet of $" + bet);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.nextLine().toUpperCase();

            if(!playAgain.equals("YES")) {
                break;
            }

        }

        System.out.println("Game over! Your final balance is $" + balance);
        

        sc.close();
    }
    static String[] spinRow() {
       
        String[] symbols = {":)", "BAR", "BELL", "CHERRY", "LEMON"};
        String[] row = new String[3];
        Random random = new Random();


       for (int i = 0; i < 3; i++) {
           row[i] = symbols[random.nextInt(symbols.length)];
       }



       //System.out.println("[" + row[0] + " | " + row[1] + " | " + row[2] + "]");

        return row; 
    }
    static void printRow(String[] row) {
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1])){
            switch(row[0]) {
                case ":)":
                    return bet * 10;
                case "BAR":
                    return bet * 5;
                case "BELL":
                    return bet * 4;
                case "CHERRY":
                    return bet * 3;
                case "LEMON":
                    return bet * 2;
                default:
                    return 0;
            }

        }
        else if (row[0].equals(row[1])){
            switch(row[0]) {
                case ":)":
                    return bet * 3;
                case "BAR":
                    return bet * 4;
                case "BELL":
                    return bet * 5;
                case "CHERRY":
                    return bet * 6;
                case "LEMON":
                    return bet * 7;
                default:
                    return 0;
            }
        }
        else if (row[1].equals(row[2])){
            switch(row[1]) {
                case ":)":
                    return bet * 2;
                case "BAR":
                    return bet * 5;
                case "BELL":
                    return bet * 4;
                case "CHERRY":
                    return bet * 3;
                case "LEMON":
                    return bet * 10;
                default:
                    return 0;
            }
        }

        return 0;
    }

}
