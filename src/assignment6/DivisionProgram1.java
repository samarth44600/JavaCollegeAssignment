// Create a Java program that takes two integer inputs from the user and divides the first
// number by the second. Implement exception handling to catch and handle any
// ArithmeticException that occurs when attempting to divide by zero.

package assignment6;

import java.util.Scanner;

// classname = DivisionProgram
public class DivisionProgram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator (an integer): ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator (an integer): ");
            int denominator = sc.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }

    public static int divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}

// Output
// Enter the numerator (an integer): 32
// Enter the denominator (an integer): 0
// Error: Division by zero is not allowed.