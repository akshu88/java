package tut15;

import java.util.Scanner;

public class weight {
    public static void main(String[] args) {

    // WEIGHT CONVERSION PROGRAM

    Scanner sc = new Scanner(System.in);

    double weight ;
    double newWeight;
    int choice;

    System.out.println("Weight Conversion Program");
    System.out.println("1: Convert lbs to kgs ");
    System.out.println("2: Convert kgs to lbs");

    System.out.println("Choose an option: ");
    choice = sc.nextInt();

    if (choice == 1){
        System.out.println("Enter the weight in lbs: ");
        weight = sc.nextDouble();
        newWeight = weight * 0.45392;
        System.out.printf("The new weight in kgs is: %.2f " , newWeight);
    }
    else if (choice == 2){
        System.out.println("Enter the weight in kgs: ");
        weight = sc.nextDouble();
        newWeight = weight * 2.20462;
        System.out.printf("The new weight in lbs is: %.2f " , newWeight);
    }

    else{
        System.out.println("That was not a valid choice");
    }


    }
}
