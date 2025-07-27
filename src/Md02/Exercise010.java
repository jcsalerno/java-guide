package Md02;
import java.util.Scanner;

public class Exercise010 {
    public static void main(String[] args) {
        // Perfect Square Verification Program
        // Create a program that receives a number and checks if it is a perfect square,
        // meaning that the square root of the number is an integer.

        System.out.println("### CHECKING PERFECT SQUARE ###");
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        scanner.nextLine();

        int root = (int) Math.sqrt(n1);
        boolean isPerfectSquare = root * root == n1;

        System.out.println(isPerfectSquare);
    }
}
