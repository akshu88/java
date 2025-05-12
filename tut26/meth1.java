package tut26;

public class meth1 {
    public static void main(String[] args) {
        


        // method =  a block of reusable code that is executed when called ()


       double result =square(3);
       System.out.println(result);

    }
    static void happyBirthday(String name, int age) {

        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n",age);
        System.out.println("Happy Birthday to you!\n");


    }

    static double square(double number){
        return number * number;
    }
}

