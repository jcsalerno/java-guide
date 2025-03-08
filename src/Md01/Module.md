### Primitive Data Types

A data type defines a particular set of values that can be represented within a program, for which specific operations can be defined. <br>
When these operations are part of the language, it is said that they constitute a primitive or predefined type.<br>
The table below lists the eight primitive types in Java, including their categories, sizes in bytes, and the valid ranges of their values.

| Category  | Type                                      | Bytes/bits                                     | Value Range                                                                                                                                                                                                                                                                                                                                   |
|-----------|-------------------------------------------|------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Integer   | byte  <br>  short <br> int <br> long <br> |  1/8 <br> 2/16 <br> 4/32 <br> 8/64             | from -128 to +127 <br> from -32.768 to +32.767 <br> from -2.147.483.648 to +2.147.483.647 <br> from -9.223.372.036.854.775.808 to +9.223.372.036.854.775.807                                                                                                                                                                                  | 
| Real      | float <br> double                         | 4/32 <br> 8/64                                 | positive values: <br> from +1.4012984643281707e-45 to +3.40282346638528860e+38 <br> negative values: <br> -3.4028234663852886e+38 to -1.401 129846432481707e-45 <br>  <br> positive values: <br> from +4.94065645841246544e-324 to +1.79769313486231570e+308 <br> negative values: <br> -1.7976931348623157e+308 to -4.94065645841246544e-324 |
| Character | char                                      | 2/16                                           | from \u0000 to \uFFFF                                                                                                                                                                                                                                                                                                                         |
| Logical   | boolean                                   | 1/8                                            | false and true                                                                                                                                                                                                                                                                                                                                |


### Creating a variable

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

### Requesting input from the user

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

### Exercises

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