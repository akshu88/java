import java.util.Scanner;
class no_ret_no_arg{
    int a,b,s=0;
    void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        a= sc.nextInt();
        System.out.println("Enter second no");
        b= sc.nextInt();
        s= a+b;
        System.out.println("Addition:"+s);
    }
}

public class add1{
    public static void main(String []args){
        int sum;
        no_ret_no_arg ob =new no_ret_no_arg();
        ob.add();
    }
}