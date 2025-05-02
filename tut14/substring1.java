package tut14;

import java.util.Scanner;

public class substring1 {

    // .substring() = A method used to extract a portion of a string 
    //                string.substring(start, end)


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.println("Enter your email: ");

        email = sc.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contains @ ");
        }


        
    }
}
