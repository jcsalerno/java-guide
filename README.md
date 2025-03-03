# Java Guide

## This guide is based on the premise of documenting my Java studies and also serving as a study resource.

### [What is a variable?](#variable)

A variable is a name defined by the programmer, to which a value belonging to a specific data type is associated, stored in a set of memory locations in the computer. <br>
You can compare the variable to a box, where you store an item and later have access to that item you stored.<br>
A good practice is to identify (or describe) the variable based on its purpose.<br>
Thus, every variable always has a name, a type, and a value (its content).<br>

### [Primitive Data Types](#primitive-types)

A data type defines a particular set of values that can be represented within a program, for which specific operations can be defined. <br>
When these operations are part of the language, it is said that they constitute a primitive or predefined type.<br>
The table below lists the eight primitive types in Java, including their categories, sizes in bytes, and the valid ranges of their values.

| Category  | Type                                      | Bytes/bits                                     | Value Range                                                                                                                                                                                                                                                                                                                                   |
|-----------|-------------------------------------------|------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Integer   | byte  <br>  short <br> int <br> long <br> |  1/8 <br> 2/16 <br> 4/32 <br> 8/64             | from -128 to +127 <br> from -32.768 to +32.767 <br> from -2.147.483.648 to +2.147.483.647 <br> from -9.223.372.036.854.775.808 to +9.223.372.036.854.775.807                                                                                                                                                                                  | 
| Real      | float <br> double                         | 4/32 <br> 8/64                                 | positive values: <br> from +1.4012984643281707e-45 to +3.40282346638528860e+38 <br> negative values: <br> -3.4028234663852886e+38 to -1.401 129846432481707e-45 <br>  <br> positive values: <br> from +4.94065645841246544e-324 to +1.79769313486231570e+308 <br> negative values: <br> -1.7976931348623157e+308 to -4.94065645841246544e-324 |
| Character | char                                      | 2/16                                           | from \u0000 to \uFFFF                                                                                                                                                                                                                                                                                                                         |
| Logical   | boolean                                   | 1/8                                            | false and true                                                                                                                                                                                                                                                                                                                                |


### [Creating a variable](#creating-variable)

```
public class Main {
    public static void main(String[] args) {
    
        // type - name = value;
        
        String guide = "Java Guide to basic to advanced";
        
        int x1 = 1;
        
        System.out.println(guide);
        
        System.out.println(x1);
        
        }

}
```

In the example above, I am declaring a variable and printing it to the console.

### [Requesting input from the user](#input)

Now let's make our program more dynamic and ask the user to input a value.

```
public class Main {
    public static void main(String[] args) {
    
       // 1. Ask the user which number they want to input.
       System.out.println("User, please enter a number:");

        // 2. Read the number entered by the user.
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();

        // 3. Multiply the entered value by 2.
        int result = enteredNumber * 2;

        // 4. Print the result in the console.
        System.out.println(result);
    
        }

}
```
Now it's up to you!<br>
Explore more.<br>
Look into concatenation, change the variable type, divide, add, and perform other operations.

### [Exercises](#exercises-md01)

#### Exercise 1: Lunch Release Statement
Create a program that reads an employee's name and prints a statement releasing them for lunch.

#### Exercise 2: Vacation Release Statement
Create a program that reads an employee's name and prints a statement saying they have been released for their vacation.

##### Exercise 3: Home Office Release Statement
Create a program that reads an employee's name and prints a statement saying they have been released to work from home.

##### Exercise 4: Meeting Release Statement
Create a program that reads an employee's name and prints a statement releasing them for a team meeting.

##### Exercise 5: Overtime Release Statement
Create a program that reads an employee's name and prints a statement saying they are allowed to work overtime.

Only exercises 1 and 2 are done.
Can you complete the remaining 3?

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
### [Exercises](#exercises-md02)

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

### Salary Increase Program
Create a program that receives an employee's current salary and a percentage increase, and calculates the new salary.






