package Md03;
import java.util.Scanner;

public class Exercise006 {
    public static void main(String[] args) {
        //Fibonacci Sequence
        //Ask how many terms of the Fibonacci sequence should be displayed.
        System.out.println("# FIBONACCI SEQUENCE #");
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int terms = sc.nextInt();
        int fib1 = 0, fib2 = 1;

        System.out.print("Fibonacci Sequence: " + fib1 + " " + fib2 + " ");

        for (int i = 3; i <= terms; i++) {
            int currentFib = fib1 + fib2;
            System.out.print(currentFib + " ");
            fib1 = fib2;
            fib2 = currentFib;
        }
        System.out.println();
    }
}
