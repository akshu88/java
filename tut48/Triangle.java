package tut48;

public class Triangle extends Shapes{

    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double area() {
        return 0.5 * base * height;
    }

}
