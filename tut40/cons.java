package tut40;
import java.util.Scanner;
public class cons {
    public static void main(String[] args) {
        
        // constructor = A special method to intialize objects
        //               You can pass arguments to a constructor
        //               and set up initial values

        Student student1 = new Student("John", 20, 3.5, true);
        Student student2 = new Student("Jane", 22, 3.8, false);
        Student student3 = new Student("Jim", 21, 3.2, true);

        /* 
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);
        */

        student1.study();
        student2.study();
        student3.study();

    }
}
