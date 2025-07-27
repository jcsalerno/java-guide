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


