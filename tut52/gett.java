package tut52;
public class gett {
    public static void main(String[] args) {
        //They help protect objects data and add rules for accessing or modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Charger","Black",10000);

        car.setColor("Blue");
        car.setPrice(-50000);
        //car.model ="Porsche";

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
