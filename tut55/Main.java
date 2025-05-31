package tut55;
public class Main {
    public static void main(String[] args) {
        //Wrapper class = Allow primitve values (int, char, double, boolean)
        //                to be used as objects. "Wrap them in an object"
        //                Generally, don't wrap primitives unless you need an object.
        //                Allows use of Collections Framework and static Utility Methods.

        //AUTOBOXING
        /* 
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        
        //UNBOXING
        int x = a;
        */

        /* 
        String a = Integer.toString(123);
        String b = Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x = a + b + c + d;
        System.out.println(x);

        */

        /*
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Coding".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        */

        char letter ='B';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
        

    }
}
