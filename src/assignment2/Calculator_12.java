import java.util.Scanner;

public class Calculator_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Enter your choice:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();
        double result = 0.0;

        // Using if-else logic
        if (choice >= 1 && choice <= 4) {
            if (choice == 1) {
                result = number1 + number2;
            } else if (choice == 2) {
                result = number1 - number2;
            } else if (choice == 3) {
                result = number1 * number2;
            } else if (choice == 4) {
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Cannot divide by zero!");
                    System.exit(0);
                }
            }
            System.out.println("Using if-else logic:");
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid choice! Please enter a valid choice.");
        }

        // Using switch-case logic
        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("Using switch-case logic:");
                System.out.println("Result: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Using switch-case logic:");
                System.out.println("Result: " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Using switch-case logic:");
                System.out.println("Result: " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Using switch-case logic:");
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a valid choice.");
        }
    }
}
