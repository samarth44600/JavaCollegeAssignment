import java.util.Scanner;

public class LargestNumberFinder_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest;

        // Using nested if
        if (num1 >= num2) {
            if (num1 >= num3) {
                largest = num1;
            } else {
                largest = num3;
            }
        } else {
            if (num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }
        }

        System.out.println("Using nested if, the largest number is: " + largest);

        // Using && operator
        largest = num1;

        if (num2 > largest && num2 > num3) {
            largest = num2;
        }

        if (num3 > largest && num3 > num2) {
            largest = num3;
        }

        System.out.println("Using && operator, the largest number is: " + largest);
    }
}
