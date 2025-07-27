## Control Structures
Software is a set of organized instructions to produce the solution to a specific problem.
By default, program instructions execute sequentially, called sequential execution flow.
However, in many cases, executing them in a strictly sequential order is not ideal.

These situations require instruction repetition or flow deviation, which can be achieved through control structures in programming languages.

## Types of Control Structures

- **Simple Repetition:** Repeats directives or blocks, creating loops. The number of repetitions can be predefined or determined during execution. In Java, this corresponds to the `for` directive.
- **Conditional Repetition:** Similar to simple repetition but relies on condition evaluation. Generally used when the number of repetitions is unknown beforehand. In Java, represented by `while` and `do-while`.
- **Flow Deviation:** Directs execution to another part of the program, breaking sequential flow. Conditional deviations occur based on condition evaluation (`if-else`, `switch`), while unconditional deviations happen automatically (`break`, `continue`).

## The `for` Loop
In Java, simple repetition is handled by the `for` loop, with the following syntax:
```
for ([initialization]; [condition]; [increment | decrement])
< directive; | { /* block */ } >
```

### When and Why Use `for`?
`for` loops are useful when the number of repetitions is known. When the number of iterations is unknown, `while` or `do-while` might be more appropriate.

- **Initialization →** Executed once, usually to declare and initialize a control variable.
- **Condition →** Evaluated before each iteration. If `true`, the block inside the `for` loop executes; otherwise, the loop terminates.
- **Increment/Decrement →** Updates the control variable after each iteration.

### Examples Using `for`

#### Example: Counting from 1 to 5
```java
public class ForExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // Starts at 1, goes up to 5
            System.out.println("Number: " + i);
        }
    }
}
```

#### Example: Counting from 10 to 0
```java
public class Countdown {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) { // Starts at 10, decrements to 0
            System.out.println(i);
        }
    }
}
```

## Let's Go to a Practical Example
You are a Java developer at Microsoft Dynamics. Your team needs a program to measure team performance.

Create a program that asks how many members are in a team. Then, request the performance score (from 1 to 10) of each member.

At the end, the program should calculate and display the team's average performance.

```java
import java.util.Scanner;

public class TeamPerformance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of team members
        System.out.print("How many members are in the team? ");
        int members = scanner.nextInt();
        double totalScores = 0;

        // Collect performance scores
        for (int i = 1; i <= members; i++) {
            System.out.print("Enter the performance score for member " + i + ": ");
            totalScores += scanner.nextDouble();
        }

        // Calculate the average
        double average = totalScores / members;

        // Display the result
        System.out.printf("The team's average performance score is: %.2f%n", average);

        scanner.close();
    }
}
```

Conditional repetition structures, or conditional loops, are directives whose execution repetition control is done by evaluating a logical expression associated with the directive.

These structures are suitable for allowing the repetition of a directive or a block for an indeterminate number of times, i.e., an unknown value during programming, but determined during program execution, such as a value provided by the user or obtained from a file.

In Java, such structures are `while` and `do while`.

### While Directive

In the while directive, a set of instructions is repeated as long as the result of the condition (a logical expression) is evaluated as true.

Here is the syntax for this directive:
`while ( <condition> )`
`<directive; | { /*block*/ } >`

The `while` evaluates the result of the condition before executing the associated directive or block, so it is possible that its execution does not occur if the condition is initially false.

The following fragments perform various counts using `while`.

#### Examples

```java
public class Countdown {
    public static void main(String[] args) {
        //Countdown 10 to 0
        int k = 10;
        while (k >= 0) {
            System.out.println(k);
            k--;
        }
    }
}
```

```java
public class ProgressiveCount {
    public static void main(String[] args) {
        //Progressive count 0 to 10
        int x = 0;
        while (x <= 10) {
            System.out.println(x);
            x = x + 1;
        }
    }
}
```

```java
public class CountByTwos {
    public static void main(String[] args) {
        //Count -5 to +5, by 2s
        int z = -5;
        while(z <= 5){
            System.out.println(z);
            z = z + 2;
        }
    }
}

``` 

You are a Java backend developer for Disney parks. The roller coaster system needs automation.

Create a program that, after it initializes, only finishes when the word (finish) is entered. The system should ask for the passenger's height; if it's greater than 160cm, the ride can be released. If it's less, the system cannot release it.

```java
import java.util.Scanner;

public class RollerCoaster {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";

        System.out.println("Welcome to the Disney Roller Coaster System!");
        System.out.println("Enter 'finalizar' at any time to exit.");

        do {
            System.out.print("\nEnter passenger height in cm (or 'finalizar' to exit): ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("finalizar")) {
                System.out.println("Exiting Roller Coaster System. Goodbye!");
                break;
            }

            try {
                int height = Integer.parseInt(command);
                if (height > 160) {
                    System.out.println("Height: " + height + "cm. Ride approved! Enjoy the ride!");
                } else {
                    System.out.println("Height: " + height + "cm. Ride denied. Minimum height is 160cm.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'finalizar'.");
            }

        } while (true);

        scanner.close();
    }
}
```

## Do While Directive

The `do while` is another conditional loop that repeats a directive or a block as long as the condition is evaluated as true, but, unlike `while`, the associated instruction is executed once before the evaluation of the logical expression used as the eventual condition.

`do {
      directive;
} while ( condition );`

### Example of Using the `do while` directive

```java
import java.util.Scanner;
public class doWhile {
 public static void main (String args []) {
   Scanner s = new Scanner(System.in);
   System.out.print("Value of the lower number? ");
   int min = s.nextInt();
   System.out.print("Upper integer value? ");
   int max = s.nextInt();
   do {
         System.out.println(min + " < " + max);
         min++;
   }while (min < max);
   System.out.println(min + " == " + max + "Final condition!");
  }
 }
 ```
