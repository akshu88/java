package tut39;

public class Car {

    String make = "BMW";
    String model = "X5";
    int year = 2020;
    double price = 50000.00;
    boolean isRunning = false;


    void start() {
        isRunning = true;
        System.out.println("Car started");
    }
    void stop() {
        isRunning = false;
        System.out.println("Car stopped");
    }
    void drive(){
        System.out.println("You drive the car " + model);
    }
    void brake(){
        System.out.println("You brake the car " + model);
    }
}
