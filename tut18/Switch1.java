import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        

        // Enhanced switch = A replacement to many else if statements 
        //                   (Java14 feature)


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = sc.nextLine();

        switch(day){
            case "Monday" : System.out.println("It's a weekday"); break;
            case "Tuesday" : System.out.println("It's a weekday"); break;
            case "Wednesday" : System.out.println("It's a weekday"); break;
            case "Thursday" : System.out.println("It's a weekday"); break;
            case "Friday" : System.out.println("It's a weekday"); break;
            case "Saturday" : System.out.println("It's the weekend"); break;
            case "Sunday" : System.out.println("It's the weekend"); break;
            default : System.out.println(day + " is not a day" );
        }
    }    
}
