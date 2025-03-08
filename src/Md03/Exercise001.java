package Md03;
import java.util.Scanner;

public class Exercise001 {
    // Sum of Numbers
    // Ask the user to enter N numbers and sum them all.

    public static void main(String[] args) {
        System.out.println("# NUMBER SUM SYSTEM #");
        System.out.println("Enter the number of values you want to sum:");
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int totalSum = 0;

        System.out.println("Enter the " + quantity + " numbers:");

        for(int i = 0; i < quantity; i++) {
            totalSum += sc.nextInt();
        }
        System.out.println("The total sum is: " + totalSum);
    }
}
