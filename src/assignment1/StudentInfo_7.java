import java.util.Scanner;

public class StudentInfo_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter your college name: ");
        String collegeName = scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Roll Number: " + rollNumber);
        System.out.println("College Name: " + collegeName);
        System.out.println("Name: " + name);

        scanner.close();
    }
}
