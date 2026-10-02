# Java Homework: Object-Oriented Calculator

A calculator exercise completed during my Java course. It demonstrates how an abstract operation class, concrete subclasses, an interface and a result object work together.

The source comes from my completed homework. It was organized for GitHub with assistant help. The original calculations and class design are retained; two small changes to the demonstration are documented below.

## What the program does

Main runs examples of addition, subtraction, multiplication and division. It also demonstrates a negative number, decimal multiplication, toString(), and rejection of division by zero. Inputs are written directly in Main; there is no interactive input or graphical interface.

## Classes

| File | Role |
| --- | --- |
| Operation.java | Abstract base class with a name, abstract calculate() method, symbol() method and an example final method |
| Addition.java | Adds two numbers |
| Subtraction.java | Subtracts the second number from the first |
| Multiplication.java | Multiplies two numbers |
| Division.java | Divides two numbers and rejects a zero divisor |
| Calculator.java | Executes an Operation and implements Printable |
| Printable.java | Interface declaring printResult() |
| CalculationResult.java | Final class holding the input numbers, symbol and result; supplies getters and toString() |
| Main.java | Runs the demonstration examples |

## Concepts practiced

- Classes, constructors and private fields
- Inheritance and an abstract class
- Method overriding and polymorphism through Operation references
- An interface and its implementation
- final fields, a final method and a final class
- Result objects, getters and readable toString() output
- Throwing and handling an IllegalArgumentException

## Run in IntelliJ IDEA

1. Create a Java project with JDK 21, or open this folder as a project.
2. Keep the Java files in `src/main/java/org/example/Homework/` so the folders match the package declaration.
3. If needed, right-click `src/main/java` and select **Mark Directory as → Sources Root**.
4. Open Main.java and run its main method using the green run icon.

No external libraries or build tool are required.

## Expected output

```text
10.0 + 5.0 = 15.0
10.0 - 5.0 = 5.0
10.0 * 5.0 = 50.0
10.0 / 5.0 = 2.0
3.0 + -10.0 = -7.0
4.0 * 2.5 = 10.0
10.0 + 5.0 = 15.0
Division by zero check: Cannot divide by zero
```

The addition result is printed twice because the homework explicitly demonstrates toString() after printing the calculation results.

## Preparation changes

- Moved the nine original files into folders matching their existing package, org.example.Homework.
- In Main, wrapped the existing division-by-zero example in try/catch. The original version intentionally triggered an exception but did not catch it; the prepared version displays the message and exits normally.
- Corrected the spelling of that exception message in Division.
- Added documentation and .gitignore. Other Java files retain the uploaded homework contents.

## Scope and verification

The nine Java files were compiled together and Main was executed successfully with OpenJDK 17. Its output was checked against the examples above. JDK 21 is the intended course setup; it was not available in the preparation environment.

The comment about equals/hashCode at the end of Main is an unfinished note; those methods are not implemented. CalculationResult is a final class, but its fields are not declared final. The example final method in Operation is retained as a classroom exercise and is not used by the calculator. This is a learning exercise using double arithmetic, not a financial calculator.
