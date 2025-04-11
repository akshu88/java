import java.util.Scanner;
class ret_no_arg{
    int a,b,s=0;
    int add(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first no");
        a=sc.nextInt();
        System.out.println("Enter second no");
        b=sc.nextInt();
        s=a+b;
        return(s);
    }
}

public class add3{
    public static void main(String []args){
        ret_no_arg ob = new ret_no_arg();
        int sum = ob.add();
        System.out.println("Addition:"+sum);
    }
}