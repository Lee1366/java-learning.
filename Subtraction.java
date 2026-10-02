package org.example.Homework;

public class Subtraction extends Operation{

    public Subtraction() {
        super("Subtraction");
    }

    @Override
    public double calculate(double first, double second) {
        return first - second;
    }

    @Override
    public String symbol() {
        return "-";
    }
}
