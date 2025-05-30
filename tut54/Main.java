package tut54;

public class Main {
    public static void main(String[] args) {
        // Composition = Represents a "part-of" relationship between objects.
        //               For example, an Engine is "part of" a Car.
        //               Atleast complex objects to be constructed from smaller objects.

        Car car = new Car("Porsche" ,2025 ,"V9");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();

    }
}
