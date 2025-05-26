package tut48;

public abstract class Shapes {

    abstract double area(); // Abstract method to calculate area

    void display() { // Concrete method to display a message
        System.out.println("This is a shape.");
    }
}
