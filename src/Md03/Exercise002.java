package Md03;
import java.util.Scanner;

public class Exercise002 {
    public static void main(String[] args) {
        // Multiplication Table
        // Ask for a number and display its multiplication table from 1 to 10.

        System.out.println(" # MULTIPLICATION TABLE # ");
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        for(int i = 0; i <= 10; i++) {
            System.out.println(n1 + " x " + i + " = " + (n1 * i));
        }
    }
}
