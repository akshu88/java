package tut45;

public class Student extends Person {
    
    double gpa;

    Student(String first, String last, double gpa){
        super(first, last); // Calls the constructor of the superclass (Person)
        this.gpa = gpa; // Initialize the gpa attribute
    }

    void showGPA() {
        System.out.println(this.first + " 's gpa is: " +  this.gpa);
    }

}
