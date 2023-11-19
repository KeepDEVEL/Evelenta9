package org.example;

class Multiplication {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

class Division {
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("-");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int product = Multiplication.multiply(5, 4);
        System.out.println(product);

        double quotient = Division.divide(10.0, 2.0);
        System.out.println(quotient);
    }
}