package tut48;

public class Rectangle extends Shapes{

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }

}
