package org.example.Homework;

public class Division extends Operation{

    public Division() {
        super("Division");
    }

    @Override
    public double calculate(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return first / second;
    }

    @Override
    public String symbol() {
        return "/";
    }

}
