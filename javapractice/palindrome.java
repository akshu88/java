import java.util.Scanner;

public class palindrome{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter word:");
        String str= sc.nextLine();
        String rev="";
        //String str = "dog";
        //String rev = "";
        
        // Reverse the string
        for(int i = str.length()-1; i>=0;i--){
            rev= rev + str.charAt(i);
        }

        //Check for palindrome
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a plaindrome");
        }
    }
}