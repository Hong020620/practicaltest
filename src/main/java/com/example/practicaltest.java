package com.example;

public class PracticalTest {

    public static int add(int numX, int numY) {
        return numX + numY;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + add(3, 5));
        System.out.println("Product: " + multiply(3, 5));
    }
}
