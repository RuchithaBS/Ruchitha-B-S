package com.tandemloopassignment;

public class Program_1 {


public double add(double a, double b) {
    return a + b;
}


public double subtract(double a, double b) {
    return a - b;
}


public double multiply(double a, double b) {
    return a * b;
}


public double divide(double a, double b) {
    if (b == 0) {
        throw new IllegalArgumentException("Division by zero is not allowed.");
    }
    return a / b;
}


public static void main(String[] args) {
 Program_1 calculator = new Program_1();

    
    double num1Add = 10.5;
    double num2Add = 5.2;
    String operationAdd = "addition";
    double resultAdd = calculator.add(num1Add, num2Add);
    System.out.println("Operation: " + operationAdd);
    System.out.println(num1Add + " + " + num2Add + " = " + resultAdd + "\n");

  
    double num1Sub = 20.0;
    double num2Sub = 7.8;
    String operationSub = "subtraction";
    double resultSub = calculator.subtract(num1Sub, num2Sub);
    System.out.println("Operation: " + operationSub);
    System.out.println(num1Sub + " - " + num2Sub + " = " + resultSub + "\n");

   
    double num1Mul = 4.0;
    double num2Mul = 3.5;
    String operationMul = "multiplication";
    double resultMul = calculator.multiply(num1Mul, num2Mul);
    System.out.println("Operation: " + operationMul);
    System.out.println(num1Mul + " * " + num2Mul + " = " + resultMul + "\n");

  
    double num1Div = 25.0;
    double num2Div = 5.0;
    String operationDiv = "division";
    try {
        double resultDiv = calculator.divide(num1Div, num2Div);
        System.out.println("Operation: " + operationDiv);
        System.out.println(num1Div + " / " + num2Div + " = " + resultDiv + "\n");
    } catch (IllegalArgumentException e) {
        System.out.println("Error for " + operationDiv + ": " + e.getMessage() + "\n");
    }


    double num1DivZero = 10.0;
    double num2DivZero = 0.0;
    String operationDivZero = "division";
    try {
        double resultDivZero = calculator.divide(num1DivZero, num2DivZero);
        System.out.println("Operation: " + operationDivZero);
        System.out.println(num1DivZero + " / " + num2DivZero + " = " + resultDivZero + "\n");
    } catch (IllegalArgumentException e) {
        System.out.println("Error for " + operationDivZero + ": " + e.getMessage() + "\n");
    }
}
}
