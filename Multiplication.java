package org.example.Homework;

public class Multiplication extends Operation {

    public Multiplication() {
        super("Multiplication");
    }

    @Override
    public double calculate(double first, double second) {
        return first * second;
    }

    @Override
    public String symbol() {
        return "*";
    }
}