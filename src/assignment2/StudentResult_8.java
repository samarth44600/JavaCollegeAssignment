import java.util.Scanner;

public class StudentResult_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks obtained in subject 1: ");
        int marks1 = scanner.nextInt();

        System.out.print("Enter the marks obtained in subject 2: ");
        int marks2 = scanner.nextInt();

        System.out.print("Enter the marks obtained in subject 3: ");
        int marks3 = scanner.nextInt();

        System.out.print("Enter the marks obtained in subject 4: ");
        int marks4 = scanner.nextInt();

        System.out.print("Enter the marks obtained in subject 5: ");
        int marks5 = scanner.nextInt();

        int totalMarks = marks1 + marks2 + marks3 + marks4 + marks5;
        double percentage = (totalMarks / 500.0) * 100;

        String division;

        if (percentage >= 80) {
            division = "Distinction";
        } else if (percentage >= 60) {
            division = "First Division";
        } else if (percentage >= 45) {
            division = "Second Division";
        } else if (percentage >= 32) {
            division = "Third Division";
        } else {
            division = "Fail";
        }

        System.out.println("Percentage: " + percentage);
        System.out.println("Division: " + division);
    }
}
