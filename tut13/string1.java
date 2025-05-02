package tut13;

import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        
        String name = "Password";

    //    int length = name.length();
    //    char letter = name.charAt(6);
    //    int index = name.indexOf(" ");
    //    int lastIndex = name.lastIndexOf("i");

    //    name = name.toUpperCase();
    //    name = name.toLowerCase();
   //     name = name.trim();
   //     name = name.replace("A" , "m");
       /*  
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("Hello " + name);
        }
            

        if(name.contains(" ")){
            System.out.println("Your name contains spaces");
        }
        else{
            System.out.println("Your name doesn't contains any spaces");
        }
        */

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}
