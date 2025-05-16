package tut34;
import java.util.Scanner;
public class arr3 {
    public static void main(String[] args) {
        
        // varargs = allow a method to accept a varying number of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ...(ellipsis) is used to denote varargs
       // Scanner sc = new Scanner(System.in);

        
        //System.out.println(add(1, 2, 3, 4));
        System.out.println(average());

       // sc.close();
    }
    static int add(int... numbers){

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}