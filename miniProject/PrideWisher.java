package miniProject;

public class PrideWisher {
    public static void main(String[] args) {
        // Fixed names
        String sender = "Akshita";
        String receiver = "Sanika";

        // Heart ASCII Art
        System.out.println("    ***       ***    ");
        System.out.println("  *******   *******  ");
        System.out.println(" ********* ********* ");
        System.out.println(" ******************* ");
        System.out.println("  *****************  ");
        System.out.println("   ***************   ");
        System.out.println("    *************    ");
        System.out.println("     ***********     ");
        System.out.println("      *********      ");
        System.out.println("       *******       ");
        System.out.println("        *****        ");
        System.out.println("         ***         ");
        System.out.println("          *          ");
        System.out.println(" LOVE IS LOVE. HAPPY PRIDE MONTH! <3\n");

        System.out.println("=========================================");
        System.out.println("     :)       PRIDE MONTH WISHER   :)   ");
        System.out.println("=========================================\n");

        System.out.println("A Message for " + receiver + " <3");
        System.out.println("-----------------------------------------\n");

        // Flirty message with typewriter effect
        typeWriter("Hey " + receiver + ",");
        typeWriter("You randomly popped into my head... and honestly, I didn’t mind it.");
        typeWriter("Pride Month felt like the perfect excuse to tell you — you're kinda hard to ignore.");
        typeWriter("I mean, that smile? That energy? You're seriously something else.");
        typeWriter("Anyway, no pressure. Just... if you're smiling right now, maybe text me back? :)");
        typeWriter("\nHappy Pride Month, you beautiful soul.");
        typeWriter("From,");
        typeWriter(sender);

        System.out.println("\n=========================================");
        System.out.println("     Stay proud. Stay awesome <3        ");
        System.out.println("=========================================");
    }

    // Typewriter animation method
    public static void typeWriter(String message) {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(30); // 30 ms delay for typing effect
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}


