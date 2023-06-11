import java.util.Scanner;

public class SmallestNumberFinder_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        System.out.print("Enter the fourth number: ");
        int number4 = scanner.nextInt();

        int smallestNumber = Math.min(Math.min(number1, number2), Math.min(number3, number4));

        System.out.println("The smallest number is: " + smallestNumber);
    }
}
