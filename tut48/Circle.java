package tut48;

public class Circle extends Shapes {

    double radius;

    Circle(double radius){
        this.radius = radius;   
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

}
