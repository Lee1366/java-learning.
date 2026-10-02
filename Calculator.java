package org.example.Homework;

public class Calculator implements Printable{

    public CalculationResult execute (Operation operation, double first, double second) {

        double result = operation.calculate(first, second);
        CalculationResult calculationResult = new CalculationResult(first, second, result, operation.symbol());

        return calculationResult ;
    }

    @Override
    public void printResult(CalculationResult result) {
        System.out.println(result);

    }
}
