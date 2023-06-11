import java.util.Scanner;

public class GreatestNumberFinder_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int greatestNumber = Math.max(number1, number2);

        System.out.println("The greatest number is: " + greatestNumber);
    }
}
