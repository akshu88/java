package tut32;

import java.util.Scanner;

public class arr1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        String[] foods;
        int size;

        System.out.println("What number of foods do you want?: ");
        size = sc.nextInt();
        sc.nextLine(); // consume the newline character left by nextInt()

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = sc.nextLine();
        }
       
        for(String food : foods){
            System.out.println(food); 
        }

        sc.close();

    }
}

