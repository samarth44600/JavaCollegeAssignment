import java.util.Scanner;

public class DayOfWeek_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int number = scanner.nextInt();

        // Using if-else logic
        if (number >= 1 && number <= 7) {
            if (number == 1) {
                System.out.println("Using if-else logic:");
                System.out.println("Sunday");
            } else if (number == 2) {
                System.out.println("Using if-else logic:");
                System.out.println("Monday");
            } else if (number == 3) {
                System.out.println("Using if-else logic:");
                System.out.println("Tuesday");
            } else if (number == 4) {
                System.out.println("Using if-else logic:");
                System.out.println("Wednesday");
            } else if (number == 5) {
                System.out.println("Using if-else logic:");
                System.out.println("Thursday");
            } else if (number == 6) {
                System.out.println("Using if-else logic:");
                System.out.println("Friday");
            } else if (number == 7) {
                System.out.println("Using if-else logic:");
                System.out.println("Saturday");
            }
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        // Using switch-case logic
        switch (number) {
            case 1:
                System.out.println("Using switch-case logic:");
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Using switch-case logic:");
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Using switch-case logic:");
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Using switch-case logic:");
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Using switch-case logic:");
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Using switch-case logic:");
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Using switch-case logic:");
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }
}
