package Md02;
import java.util.Scanner;

public class Exercise003 {
    public static void main(String[] args) {

        // Program to calculate the area of a rectangle
        // Create a program that receives the width and height of a rectangle and calculates its area.

        System.out.println("# PROGRAM TO CALCULATE THE AREA OF A RECTANGLE #");
        System.out.println("Enter the base of the triangle");
        Scanner scanner = new Scanner(System.in);
        float base = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Enter the height of the triangle");
        float height = scanner.nextFloat();
        scanner.nextLine();

        float rectangleArea = (base * height) / 2;

        System.out.println("The area of the triangle is cm² " + rectangleArea);

    }
}
