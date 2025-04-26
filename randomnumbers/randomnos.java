package randomnumbers;

import java.util.Random;
import java.util.Scanner;

public class randomnos {
    public static void main(String []args){
        Random random = new Random();
        /* 
        int number;
        int number2;
        int number3;
        

        number = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);


        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);


 
        double number;
        number = random.nextDouble();
        System.out.println(number);
    

        */




        boolean isHeads;
        isHeads =random.nextBoolean();

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
        


    

    }
}
