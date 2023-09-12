package org.example;

public class LogFunction implements SingleArgMathFunction {
    private static String name = "Log";

    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.log(arg);
    }
}
