import java.util.Scanner;
class ret_and_arg{
    int s=0;
    int add(int a, int b){
        s=a+b;
        return(s);
    }
}

public class add4{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int sum,a,b;
        ret_and_arg ob = new ret_and_arg();
        System.out.println("Enter first no");
        a= sc.nextInt();
        System.out.println("Enter second no");
        b= sc.nextInt();
        sum = ob.add(a,b);
        System.out.println("Addition:"+sum);
    }
}