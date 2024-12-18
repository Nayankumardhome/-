package com.nayan.demos;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter num1: ");
        double num1 = sc.nextDouble();
        System.out.println("Operators:");
        System.out.println('+');
        System.out.println('-');
        System.out.println('*');
        System.out.println('/');
        System.out.println('^');
        
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);
        
        System.out.print("Enter num2: ");
        double num2 = sc.nextDouble();
        
        boolean inValidOperator = false;
        
        while (true) {
            if (inValidOperator) {
                System.out.println("Please enter a valid operator:");
                System.out.println('+');
                System.out.println('-');
                System.out.println('*');
                System.out.println('/');
                System.out.println('^');
                operator = sc.next().charAt(0);
                inValidOperator = false;
            }
            
            switch (operator) {
                case '+':
                    if (num1 % 1 == 0 && num2 % 1 == 0) {
                        System.out.println(addition((int) num1, (int) num2));
                    } else {
                        System.out.println(addition(num1, num2));
                    }
                    break;
                case '-':
                    if (num1 % 1 == 0 && num2 % 1 == 0) {
                        System.out.println(subtraction((int) num1, (int) num2));
                    } else {
                        System.out.println(subtraction(num1, num2));
                    }
                    break;
                case '*':
                    if (num1 % 1 == 0 && num2 % 1 == 0) {
                        System.out.println(multiplication((int) num1, (int) num2));
                    } else {
                        System.out.println(multiplication(num1, num2));
                    }
                    break;
                case '/':
                    if (num1 % 1 == 0 && num2 % 1 == 0) {
                        System.out.println(division((int) num1, (int) num2));
                    } else {
                        System.out.println(division(num1, num2));
                    }
                    break;
                case '^':
                    if (num1 % 1 == 0 && num2 % 1 == 0) {
                        System.out.println(power((int) num1, (int) num2));
                    } else {
                        System.out.println(power(num1, num2));
                    }
                    break;
                default:
                    inValidOperator = true;
                    System.out.println("Invalid Operator. Please try again.");
            }
            
            if (!inValidOperator) {
                sc.close();
                return; 
            }
        }
    }
  
    // Integer addition
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
  
    // Double addition
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
  
    // Integer subtraction
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
  
    // Double subtraction
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
  
    // Integer multiplication
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
  
    // Double multiplication
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
  
    // Integer division
    public static int division(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 2147483647;
        }
        return num1 / num2;
    }
  
    // Double division
    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 1.7976931348623157E308;
        }
        return num1 / num2;
    }
  
    // Integer power
    public static int power(int num1, int num2) {
    	// Handle edge case where exponent is 0
    	if (num2 == 0) {
            return 1;  // Any number raised to the power of 0 is 1
        }
    	
    	// Handle edge case where base is 0 and exponent is positive
        if (num1 == 0) {
            return 0;  // 0 raised to any positive power is 0
        }
        
        // Handle negative exponents (return 0 for simplicity in integer math)
        if (num2 < 0) {
            return 0;  // We return 0 for negative exponents in integer math, since integer powers can't handle fractional results
        }

        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result *= num1; // Multiply by num1 each time
        }

        return result;
    }
  
    // Double power
    public static double power(double num1, double num2) {
    	// Handle negative exponents
        if (num2 < 0) {
            num1 = 1 / num1;
            num2 = -num2;
        }

        double result = 1;
        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }
        
        return result;
    }
}
