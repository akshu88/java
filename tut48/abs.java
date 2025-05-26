package tut48;

public class abs {
    public static void main(String[] args) {
        
        // abstract = Used to define abstract classes and mehtods.
        //            Abstraction is the prcess of hidinh implementation details
        //            and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(6,7);

        //circle.display();
        //triangle.display();
       // rectangle.display();
       System.out.println("Circle area: " + circle.area());
       System.out.println("Triangle area: " + triangle.area());
       System.out.println("Rectangle area: " + rectangle.area());

    }
}
