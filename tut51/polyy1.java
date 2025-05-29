package tut51;

import java.util.Scanner;

public class polyy1 {
    public static void main(String[] args) {
        // Runtime Polymorphism = When the method that gets executed is declined
        //                        at runtime based on the actual type of the object.

        Scanner sc = new Scanner(System.in);
        Animal animal;
        System.out.print("Would you like a dog or a cat (1 = dog, 2 = cat): ");
        int choice = sc.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
    }
}
