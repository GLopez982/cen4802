import java.util.Scanner;

/**
 * This class provides a method to calculate the nth term in the Fibonacci sequence
 * and a main method to receive input from the user.
 */

public class Fibonacci {
    /**
     * This method calculates the nth term in the Fibonacci sequence.
     *
     * @param n the position in the Fibonacci sequence to calculate
     *          (must be a non-negative integer)
     * @return the nth term of the Fibonacci sequence
     */

    public static int fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    /**
     * The main method of the class that prompts the user for input, calculates the nth
     * Fibonacci term, and displays the result.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for the fibonacci number: ");
        int n = input.nextInt();


        System.out.println("The nth term of the Fibonacci sequence is: " + fibonacci(n));

        System.out.println("Exiting program, Have a nice day!");

    }

}
