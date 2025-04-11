import java.util.Scanner;
class no_ret_only_arg{
    int s=0;
    void add(int a, int b){
        s=a+b;
        System.out.println("Addition:"+s);
    }
}

public class add2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        no_ret_only_arg ob= new no_ret_only_arg();
        System.out.println("Enter first no");
        a= sc.nextInt();
        System.out.println("Enter second no");
        b= sc.nextInt();
        ob.add(a,b);
    }
}