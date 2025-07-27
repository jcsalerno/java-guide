package Md02;
import java.util.Scanner;

public class Exercise008 {
    public static void main(String[] args) {
    //Salary calculation program with bonus
    //Create a program that receives an employee's salary and a bonus percentage, and calculates the total amount to be paid.

    System.out.println("# SALARY CALCULATION WITH BONUS #");
    System.out.println("Enter your salary:");
    Scanner scanner = new Scanner(System.in);
    float salary = scanner.nextFloat();
    scanner.nextLine();

    System.out.println("Enter the bonus percentage:");
    float bonus = scanner.nextFloat();
    scanner.nextLine();

    float totalBonus = salary * (bonus / 100);
    float finalSalary = totalBonus + salary;

    System.out.println("The bonus to be paid is R$ " + totalBonus);
    System.out.println("Your total salary is R$ " + finalSalary);

    }
}
