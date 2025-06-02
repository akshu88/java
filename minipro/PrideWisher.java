package minipro;
import java.util.Scanner;

public class PrideWisher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("=========================================");
        System.out.println("     :)       PRIDE MONTH WISHER   :)   ");
        System.out.println("=========================================\n");

        System.out.print("Your name: ");
        String sender = sc.nextLine();

        System.out.println("Who are you thinking about today? ");
        String receiver = sc.nextLine();

        System.out.println("\n-----------------------------------------");
        System.out.println("      A Little Message for " + receiver + " <3");
        System.out.println("-----------------------------------------\n");

        System.out.println("Hey " + receiver + ",");
        System.out.println("So... " + sender + " was just thinking about you.");
        System.out.println("And figured, what better time than Pride Month");
        System.out.println("to tell you how amazing you are? ");

        System.out.println("\nYou're kind of a whole vibe.");
        System.out.println("If confidence and good looks were a contest,");
        System.out.println("you would win. No debate.");

        System.out.println("\nAnyway... Happy Pride Month!");
        System.out.println("Be proud. Be loud. And maybe, text me back? ");

        System.out.println("\nLots of Love from ,");
        System.out.println(sender);

        System.out.println("\n=========================================");
        System.out.println("     Stay proud. Stay awesome<3        ");
        System.out.println("=========================================");

        sc.close();
    }
}
