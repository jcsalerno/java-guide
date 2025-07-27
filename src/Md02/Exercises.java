package Md02;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        // You are a Java developer at company A&B, which has innovative elevators that take people from Earth to the Moon.
        // The elevator always carries 3 people.
        // Create a program that receives the weight of these 3 people and calculates the total weight of the elevator.

        System.out.println("# ELEVATOR OF COMPANY A&B #");

        System.out.println("# Enter the weight of the first person");
        Scanner sc = new Scanner(System.in);
        float firstPersonWeight = sc.nextFloat();
        sc.nextLine();

        System.out.println("# Enter the weight of the second person");
        float secondPersonWeight = sc.nextFloat();
        sc.nextLine();

        System.out.println("# Enter the weight of the third person");
        float thirdPersonWeight = sc.nextFloat();
        sc.nextLine();

        float totalWeight = firstPersonWeight + secondPersonWeight + thirdPersonWeight;

        System.out.println("The total weight of the elevator is " + String.format("%.2f", totalWeight) + " Kilos");
        System.out.println("Preparing for takeoff.............................");




    }
}
