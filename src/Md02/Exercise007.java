package Md02;
import java.util.Scanner;

public class Exercise007 {
    public static void main(String[] args) {
        //Temperature conversion program
        //Create a program that receives a temperature in Celsius and converts it to Fahrenheit.

        System.out.println("### PROGRAM TO CONVERT CELSIUS TO FAHRENHEIT ###");
        System.out.println("Enter the temperature in Celsius:");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        scanner.nextLine();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("The converted temperature is " + fahrenheit + " ºF");

    }
}
