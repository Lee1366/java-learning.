package org.example.Homework;

public class Main {
    public static void main(String[] args){

        Operation addition = new Addition ();
        Operation subtraction = new Subtraction();
        Operation multiplication = new Multiplication();
        Operation division = new Division();


        Calculator calculator = new Calculator ();

        CalculationResult result1 =
                calculator.execute(
                        addition,
                        10,
                        5);

         calculator.printResult(result1);



        CalculationResult result2 =
                calculator.execute(
                        subtraction,
                        10,
                        5);

        calculator.printResult(result2);


        CalculationResult result3 =
                calculator.execute(
                        multiplication,
                        10,
                        5);

        calculator.printResult(result3);

        CalculationResult result4 =
                calculator.execute(
                        division,
                        10,
                        5);

        calculator.printResult(result4);


        //yek motaghayer misazam az noe CalculationResult ke esmesh nagitiveResult e

        CalculationResult negativeResult =
                calculator.execute(
                        addition,
                        3,
                        -10);

        calculator.printResult(negativeResult);


        CalculationResult decimalResult =
                calculator.execute(
                        multiplication,
                        4,
                        2.5 );

        calculator.printResult(decimalResult);


        //toString check
        System.out.println(result1.toString());


        // Division by zero is rejected by Division.calculate().
        // Catch the expected exception so this demonstration ends cleanly.
        try {
            CalculationResult zeroCheck = calculator.execute(division, 10, 0);
            calculator.printResult(zeroCheck);
        } catch (IllegalArgumentException exception) {
            System.out.println("Division by zero check: " + exception.getMessage());
        }

        //equals and hash
    }
}
