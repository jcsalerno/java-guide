package Md03;
import java.util.Scanner;

public class Exercise004 {
    public static void main(String[] args) {
        // Sum of Odd Numbers
        // Ask for a number and sum all the odd numbers from 1 to that number.
        System.out.println("# SUM OF ODD NUMBERS #");
        System.out.println("Enter N to calculate the sum:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int totalSum = 0;

        System.out.println("Summing odd numbers up to " + n1 + "...");

        for(int i = 1; i <= n1; i += 2){
            totalSum += i;
        }

        System.out.println("The sum of odd numbers from 1 to " + n1 + " is: " + totalSum);
    }
}
