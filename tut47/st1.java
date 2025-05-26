package tut47;

public class st1 {
    public static void main(String[] args) {
        
        // .toString() = Method inherited from the object class
       //                Used to return a string representation of an object
       //                By default, it returns a hash code as a unique identifier.
       //                It can be overridden to provide meanigful details.

       Car car1 = new Car("Porsche", "911", 2023, "Red");
       Car car2 = new Car("Tesla", "Model S", 2023, "Black");

       System.out.println(car1);
       System.out.println(car2);
      // System.out.println(car.toString());

    }
}
