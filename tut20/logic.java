package tut20;

import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
        
        // && = AND
        // || = OR
        // ! = NOT

        /* 
        double temp = 35;
        boolean isSunny = false;


        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is sunny outside");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){  
            System.out.println("The weather is GOOD");
             System.out.println("It is CLOUDY outside");
        }
        else if(temp > 30 || temp < 0 ){
            System.out.println("The weather is bad");
        }
*/

        Scanner  sc = new Scanner(System.in);
        
        // username must be between 4-12 characters
        // username must not contain spaces or underscore

        String username;

        System.out.print("Enter your username: ");
        username = sc.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscore");
        }
        else{
            System.out.println("Welcome " + username);
        }



    }
}
