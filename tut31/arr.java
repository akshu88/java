package tut31;

import java.util.Scanner;
import java.util.Arrays;

public class arr {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits ={ "apple" , "banana" , "orange" , "grape" , "kiwi" };

        //fruits[4] = "pineapple";
        //int numOfFruits = fruits.length;
        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        //NORMAL FOR LOOP
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        //ENHANCED FOR LOOP
        /* 
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        */
    }
}
