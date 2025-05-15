package tut33;

import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = {1,3,5,7,6};
        String[] fruits = {"apple", "banana", "orange"};
        boolean isFound = false;
        String target;



        System.out.print("Enter a fruit to search: ");
        target = sc.nextLine();
       
        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Found " + target + " at index " + i);
                isFound = true;
                break;
            
            }
        }
        if(!isFound){
            System.out.println("Element " + target + " not found in the array");
        }
        sc.close();
    }
}