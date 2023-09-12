package org.example;

public class SinFunction implements SingleArgMathFunction {
    private static String name = "Sin";

    public String getName() {
        return name;
    }

    @Override
    public double calculate(double arg) {
        return Math.sin(arg);
    }
}
