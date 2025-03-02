import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {

        //Lunch Release Statement
        //Create a program that reads an employee's name and prints a statement releasing them for lunch.

        /*System.out.println("# Release System #");
        System.out.println("# Enter the employee's name #");
        Scanner sc = new Scanner(System.in);
        String employeeLunch = sc.nextLine();
        System.out.println("Releasing for lunch .............................");
        System.out.println("The employee " + employeeLunch + " is allowed to have lunch.");*/


        //Vacation Release Statement
        //Create a program that reads an employee's name and prints a statement saying they have been released for their vacation.

        System.out.println("# VACATION SYSTEM #");
        System.out.println("Enter the employee's name for vacation approval.");
        Scanner sc = new Scanner(System.in);
        String employeeVacation = sc.nextLine();
        System.out.println("APPROVAL COMPLETED!");
        System.out.println("The employee " + employeeVacation + " is now approved for their vacation.");

    }
}
