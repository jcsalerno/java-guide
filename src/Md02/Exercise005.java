package Md02;
import java.util.Scanner;

public class Exercise005 {
    public static void main(String[] args) {
    // Distance traveled program
    // Create a program that receives the speed and travel time of a car and calculates the distance traveled.

     System.out.println("# PROGRAM TO CALCULATE THE DISTANCE TRAVELED #");
     System.out.println("What is the speed of your car?");
     Scanner scanner = new Scanner(System.in);
     float speed = scanner.nextFloat();
     scanner.nextLine();

     System.out.println("What is the travel time?");
     float time = scanner.nextFloat();
     scanner.nextLine();

     float distanceTraveled = speed * time;

     System.out.println("The distance traveled is: " + distanceTraveled + " km");

    }
}
