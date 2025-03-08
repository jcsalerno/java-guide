package Md03;
import java.util.Scanner;

public class Exercise003 {
    public static void main(String[] args) {
        // Even Numbers
        // Ask for a number and display all even numbers from 1 to that number.

        System.out.println(" # CHECK IF A NUMBER IS EVEN # ");
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        for(int i = 0; i <= n1; i += 2) {
            System.out.println("Even number: " + i);
        }
    }
}
