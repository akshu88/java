package tut56;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {
        // ArrayList = A resizable array that stores objects (autoboxing).
        //             Arrays are fixed in size , but ArrayLists can change.
        
        //ArrayList<Integer> list = new ArrayList<>();
        //ArrayList<Double> list = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();
        
        /*
        list.add(3);
        list.add(1);
        list.add(2);
        */

        /*
        list.add(3.13);
        list.add(1.34);
        list.add(2.67);
        */

        /*
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        //fruits.remove(1);
        //fruits.set(1, "Watermelon");

        //System.out.println(fruits.get(2));
        //System.out.println(fruits.size());

        Collections.sort(fruits);

        //System.out.println(fruits);
        for(String fruit : fruits){
            //System.out.println(fruits);
            System.out.println(fruit);
        }
        */


        Scanner sc = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOfFood = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food number" + i + ": ");
            String food = sc.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        sc.close();

    }
}
