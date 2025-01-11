

import java.util.Scanner;


public class Fibonacci {


    public static int fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for the fibonacci number: ");
        int n = input.nextInt();


        System.out.println("The nth term of the Fibonacci sequence is: " + fibonacci(n));

        System.out.println("Exiting program, Have a nice day!");

    }

}
