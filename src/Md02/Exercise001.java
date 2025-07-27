// Age Sum Program
// Create a program that receives the age of 3 people and calculates their average age.

package Md02;

import java.util.Scanner;

public class Exercise001 {
    public static void main(String[] args) {

        System.out.println("# AVERAGE AGE OF 3 PEOPLE #");

        System.out.println("Enter the age of the first person:");
        Scanner sc = new Scanner(System.in);
        int firstPersonAge = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the age of the second person:");
        float secondPersonAge = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the age of the third person:");
        float thirdPersonAge = sc.nextFloat();
        sc.nextLine();

        float averageAge = (firstPersonAge + secondPersonAge + thirdPersonAge) / 3;

        System.out.println("The average age is: " + averageAge + " years");

    }
}
