import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */


public class P10_IfElse {
    public static void ifElse(double num1, double num2, char operation) {

        double result = 0;

        if (operation == '+') {
            result = num1 + num2;
            System.out.println("Result of addition: " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("Result of subtraction: " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println("Result of multiplication: " + result);
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result of division: " + result);
            } else {
                System.out.println("Error: Division by zero.");
            }
        } else {
            System.out.println("Invalid operation symbol.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number:- ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter operation symbol (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        ifElse(num1, num2, operation);

        scanner.close();
    }
}