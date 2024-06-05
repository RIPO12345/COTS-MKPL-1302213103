package com.mycompany.cots.mkpl;

import java.util.Scanner;

public class CotsMkpl1302213103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Input dan proses pertama
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Choose operation (+, -, *, /): ");
        String operation = scanner.next();
        
        int result;
        switch (operation) {
            case "+":
                result = calculator.add(num1, num2);
                break;
            case "-":
                result = calculator.subtract(num1, num2);
                break;
            case "*":
                result = calculator.multiply(num1, num2);
                break;
            case "/":
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        
        System.out.println("Result: " + result);

        // Input dan proses kedua (duplikasi)
        System.out.println("Enter first number: ");
        int num3 = scanner.nextInt();
        
        System.out.println("Enter second number: ");
        int num4 = scanner.nextInt();
        
        System.out.println("Choose operation (+, -, *, /): ");
        String operation2 = scanner.next();
        
        int result2;
        switch (operation2) {
            case "+":
                result2 = calculator.add(num3, num4);
                break;
            case "-":
                result2 = calculator.subtract(num3, num4);
                break;
            case "*":
                result2 = calculator.multiply(num3, num4);
                break;
            case "/":
                result2 = calculator.divide(num3, num4);
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        
        System.out.println("Result: " + result2);
    }
}
