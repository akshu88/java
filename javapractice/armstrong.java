public class armstrong {
    public static void main(String [] args){
        int num = 125;
        int original =num;
        int sum=0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum+(digit*digit*digit);
            num = num/10;
        }

        if (sum == original){
            System.out.println("is armstrong number:"+original);
        }

        else{
            System.out.println("is not an armstrong number:"+original);
        }
    }
}