package tut45;

public class Employee extends Person {

    int salary;

    Employee(String first, String last, int salary) {
        super(first, last); // Calls the constructor of the superclass (Person)
        this.salary = salary; // Initialize the salary attribute
    }

    void showSalary() {
        System.out.println(this.first + " 's salary is $" + this.salary);
    }

}
