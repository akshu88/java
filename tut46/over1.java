package tut46;

public class over1 {
    public static void main(String[] args) {
        
        //Method overriding = when a subclass provides its own
        //                    implementation of a method that is already defined.
        //                    Allows for code reuseability and give specific implementation.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move(); 
        cat.move(); 
        fish.move(); 
        

    }
}
