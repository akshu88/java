import java.util.Scanner;

class k{
    void area(int r){
        double ar=0;
        ar=(Math.PI)*r*r;
        System.out.println("area of circle="+ar);
    }

    void area(int l, int b){
        double ar=0;
        ar=l*b;
        System.out.println("area of rectangle="+ar);
    }

    void area(int l, int b,int h){
        double ar=0;
        ar=l*b*h;
        System.out.println("area of cuboid ="+ar);
    }
}

public class methodoverload{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        k o= new k();
        System.out.println("enter radius");
        int r= sc.nextInt();
        System.out.println("enter lenght");
        int l = sc.nextInt();
        System.out.println("enter breadth");
        int b= sc.nextInt();
        System.out.println("enter height");
        int h =sc.nextInt();
        o.area(r);
        o.area(l,b);
        o.area(l,b,h);
    }
}