package Md02;
import java.util.Scanner;

public class Exercise006 {
    public static void main(String[] args) {
    // Discount calculation program
    // Create a program that receives the price of a product and the discount percentage, then calculates the final price after the discount is applied.

     System.out.println("# THIS PROGRAM CALCULATES THE DISCOUNT #");
     System.out.println("What is the price of the product?");
     Scanner scanner = new Scanner(System.in);
     float originalPrice = scanner.nextFloat();
     scanner.nextLine();

     System.out.println("What is the discount percentage you are entitled to?");
     float discount = scanner.nextFloat();
     scanner.nextLine();

     float discountValue = originalPrice * (discount / 100);

     float finalPrice = originalPrice - discountValue;

     System.out.println("The final price after discount is $ " + finalPrice);

    }
}
