package org.example.Homework;

public class Addition extends Operation {

    public Addition() {
        super("Addition");
    }

    @Override
    public double calculate(double first, double second) {
        return first + second;
    }

    @Override
    public String symbol() {
        return "+";

    }
}

