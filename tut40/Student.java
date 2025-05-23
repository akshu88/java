package tut40;

public class Student {
    String name = "John Doe";
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;

    }

    void study(){
        System.out.println(name + " is studying");
    }
}
