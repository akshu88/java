package tut44;

public class main {
    public static void main(String[] args) {
        
        // Inheritance = One class inherits the attributes and methods of another class.
        //               Child <- Parent <- Grandparent


        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println("Dog lives: " + dog.lives);
        System.out.println("Cat lives: " + cat.lives);

        dog.speak();
        cat.speak();

       System.out.println("Dog is alive: " + dog.isAlive);
       System.out.println("Cat is alive: " + cat.isAlive);

       System.out.println("Plant is alive: " + plant.isAlive);

       plant.photosynthesize();

       

    }
}
