package tut24;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        

        // break = break out of a loop(STOP)
        // continue = skip the current iteration of a loop(SKIP)

        Scanner sc = new Scanner(System.in);

        for(int i =0; i< 10; i++){

            if(i == 5){
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
