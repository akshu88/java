package tut45;

public class stats {
    public static void main(String[] args) {
        
        //super = Refers to the parent class(subclass <- superclass)
        //        Used in constructors and method overriding
        //        Calls the parent class constructor to initialize attributes

        Person person = new Person("Akshita", "Agarwal");
        Student student = new Student("Harry", "Potter", 3.8);
        Employee employee = new Employee("Hermione", "Granger", 50000);

        //person.showName();
        //student.showName(); // Calls the method from the superclass (Person)
        //System.out.println("GPA: " + student.gpa);
        //student.showGPA(); // Calls the method from the subclass (Student)
        employee.showSalary(); 


    }
}
