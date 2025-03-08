## Operators and Expressions
The Java language provides a wide range of operators designed for assignment, arithmetic, logical, relational, and bitwise operations.  
<br>
These operators are represented by symbols composed of one to four characters, such as `+` (addition or positive sign) or `&&` (logical AND).
<br>
<br>
Expressions are constructions that can consist of a single literal value, constant, variable, or method call, but they can also combine multiple elements through operators to obtain a numerical or logical result.
<br>

### Simple Assignment Operator
Assignment is the operation that defines the value of a variable by evaluating the result of an expression involving literals, constants, variables, methods, and various operations.
<br>
The simple assignment stores the result of an expression evaluation in a variable and uses the following syntax:
<br>
` variable = expression ;`
<br>
This syntax means "variable receives (the result of) expression" and can be used both in the declaration of new variables (initialization) and for existing variables:
<br>
`boolean result = false;`
<br>
`int i = 0;`
<br>
`y = a * x + b;`
<br>

### Arithmetic Operators
Java has several arithmetic operators, as shown in the table below:
<br>

| Operator | Meaning                       | Associativity | Example    |
|----------|-------------------------------|---------------|------------| 
| +        | Addition                      | Left          | 5 + 2      |
| -        | Subtraction                   | Left          | 10 - 2     |
| *        | Multiplication                | Left          | 7 * 4      |
| /        | Division                      | Left          | 4 / 2      |
| %        | Remainder of integer division | Left          | 7 % 2      |
| -        | Negative sign (unary -)       | Right         | - 5        |
| +        | Positive sign (unary +)       | Right         | + 5        |
| ++       | Unary increment               | Left/Right    | ++5 or 5++ |
| --       | Unary decrement               | Left/Right    | --8 or 8-- |

<br>

The addition, subtraction, multiplication, and division operators, as well as the positive and negative signs, behave as they do in common algebra.
Expressions can combine variables and literals using various operators. The use of parentheses allows, as in algebra, to change the precedence (or priority) of operations.
<br>

### Let's go to a practical example
You are a Java developer at company A&B, which has innovative elevators that take people from Earth to the Moon. <br>
The elevator always carries 3 people. <br>
Create a program that receives the weight of these 3 people and calculates the total weight of the elevator.

```
public class Main {
    public static void main(String[] args) {
    
        System.out.println("# ELEVATOR OF COMPANY A&B #");
        
        System.out.println("# Enter the weight of the first person");
        Scanner sc = new Scanner(System.in);
        int firstPersonWeight = sc.nextInt();
        sc.nextLine();

        System.out.println("# Enter the weight of the second person");
        int secondPersonWeight = sc.nextInt();
        sc.nextLine();

        System.out.println("# Enter the weight of the third person");
        int thirdPersonWeight = sc.nextInt();
        sc.nextLine();

        int totalWeight = firstPersonWeight + secondPersonWeight + thirdPersonWeight;

        System.out.println("The total weight of the elevator is " + totalWeight + " Kilos");
        System.out.println("Preparing for takeoff.............................");
        
        }

}
```
### Exercises

#### Age Sum Program
Create a program that receives the age of 3 people and calculates their average age.

#### Price Calculator Program
Create a program that receives the price of 3 products and calculates the total value of the purchase.

#### Rectangle Area Calculation Program
Create a program that receives the width and height of a rectangle and calculates its area.

#### Grade Average Program
Create a program that receives the grades of 4 students and calculates the final average grade of the class.

#### Distance Traveled Program
Create a program that receives the speed and travel time of a car and calculates the distance traveled.

#### Discount Calculation Program
Create a program that receives the price of a product and the discount percentage, and calculates the final price of the product after the discount.

#### Temperature Conversion Program
Create a program that receives a temperature in Celsius and converts it to Fahrenheit.

#### Salary Calculation with Bonus Program
Create a program that receives an employee's salary and a bonus percentage, and calculates the total amount to be paid.

#### Salary Increase Program
Create a program that receives an employee's current salary and a percentage increase, and calculates the new salary.