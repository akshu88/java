package tut26;

public class meth1 {
    public static void main(String[]args){

        // methods = a block of reuseable code that is executed when called ()
/* 
        String name ="Akshita";
        int age = 20;
        happyBirthday(name , age);
   */
        
       // System.out.println(square(3));
       //System.out.println(cube(3));

       //String fullName = "Akshita Agarwal";
       //System.out.println(fullName);
        
       int age = 20;

       if(ageCheck(age)){
        System.out.println("You may sign up!");
       }
       else{
        System.out.println("You must be 18+ to sign up!");
       }
             
    }

    static void happyBirthday(String name , int age ){

        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n",name);
        System.out.printf("You are %d years old!\n",age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube (double number){
        return number * number * number;
    }
    static String getFullName(String first , String last){
       return first + " " + last; 
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}