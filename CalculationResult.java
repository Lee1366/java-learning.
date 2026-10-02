package org.example.Homework;

//this class is final, no inheritance needed from this class
public final class CalculationResult {

    private double firstNumber;
    private double secondNumber;
    private double result;
    private String symbol;

    public CalculationResult(double firstNumber, double secondNumber, double result, String symbol) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.result = result;
        this.symbol = symbol;
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getResult() {
        return result;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return firstNumber + " " +
                symbol + " " +
                 secondNumber +
                 " = " + result;
    }





}
