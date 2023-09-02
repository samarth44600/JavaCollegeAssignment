// Write a program that take number inputs from user, if the user inputs any other value than
// number then alert the user “Invalid Number”, make use of exception handling that catches
// if invalid input is given.

package assignment6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt();
            System.out.println("You entered: " + userInput);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Number. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

// output
// Enter a number: dsa
// Invalid Number. Please enter a valid integer.