package org.example.Homework;

public abstract class Operation {

    // I made this filed final cause there is no need to change its name
    private final String name;

    public Operation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

   
    public abstract double calculate(
            double first,
            double second
    );

    public String symbol() {
       return "";
    }


    // final method, which cannot be override in child class
    public final void exampleMethod() {
        System.out.println("This method is invalid");
    }


}







