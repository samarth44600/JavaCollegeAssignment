import java.util.Scanner;

public class NumberComparison_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            int difference = number1 - number2;
            System.out.println("The difference of the numbers is: " + difference);
        } else {
            int sum = number1 + number2;
            System.out.println("The sum of the numbers is: " + sum);
        }
    }
}
