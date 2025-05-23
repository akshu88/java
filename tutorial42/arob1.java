package tutorial42;

public class arob1 {
    public static void main(String[] args) {
        /* 
        Car car1 = new Car("BMW", "red");
        Car car2 = new Car("Porsche", "blue");
        Car car3 = new Car("Mercedes", "black");
        */

        Car[] cars = {new Car("BMW", "red"), 
                      new Car("Porsche", "blue"), 
                      new Car("Mercedes", "black")};

        //Car[] cars = {car1, car2, car3};

        /* 
        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }
         */
        
        for (Car car : cars) {
            car.color = "black";
        }
        
        for (Car car : cars) {
            car.drive();
        }

    }
}
