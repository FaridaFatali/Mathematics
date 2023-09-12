package org.example;

public class CosFunction implements SingleArgMathFunction {
    private static String name = "Cos";

    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.cos(arg);
    }
}
