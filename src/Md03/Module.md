## Relational Operators

Relational operators compare literal values, variables, or expressions that produce a logical result, either false or true.
See the table below:

| Operator | Meaning        | Associativity | Example |
|----------|---------------|---------------|---------|
| ==       | Equal         | Left          | 1 == 1  |
| !=       | Not Equal     | Left          | 1 != 2  |
| >        | Greater than  | Left          | 2 > 1   |
| >=       | Greater or equal | Left       | 4 >= 3  |
| <        | Less than     | Left          | 6 < 7   |
| <=       | Less or equal | Left          | 1 <= 2  |

The equality operator is defined as a double equal sign (==) and should not be confused with the assignment operator represented by a single equal sign (=).

## Logical Operators
Logical operators logically connect the results of different arithmetic or relational expressions, allowing the construction of complex expressions composed of multiple parts:

| Operator | Meaning             | Associativity | Example   |
|----------|---------------------|---------------|-----------|
| `&&`     | Logical AND         | Left          | `1 && 1`  |
| `\|\|`   | Logical OR          | Left          | `1 \|\| 2`|
| `!`      | Negation            | Right         | `!1`      |
| `^`      | Exclusive OR (XOR)  | Left          | `1 ^ 2`   |

## Ternary Operator
The ternary operator is a condition evaluator that allows selecting between two different expressions based on the evaluated condition result.

### Syntax:
```
<condition> ? <expression_true> : <expression_false>
```
When the evaluated condition is true, the operator returns `expression_true`; otherwise, it returns `expression_false`.

This operator is convenient for conditional assignments or simple conditional outputs:

#### Example 1:
Two real values:
```
double x = 12.34, y = 56.78;
double max = x > y ? x : y;
```

#### Example 2:
An integer value:
```
int a = 100;
System.out.println("A - " + a + (a > 50 ? " is " : " is not ") + " greater than 50.");
```

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

