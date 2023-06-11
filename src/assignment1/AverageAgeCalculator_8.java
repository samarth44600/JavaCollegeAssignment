import java.util.Scanner;

public class AverageAgeCalculator_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the age of the first person: ");
        int age1 = scanner.nextInt();

        System.out.print("Enter the age of the second person: ");
        int age2 = scanner.nextInt();

        System.out.print("Enter the age of the third person: ");
        int age3 = scanner.nextInt();

        double averageAge = (age1 + age2 + age3) / 3.0;

        System.out.println("Average age: " + averageAge);

        scanner.close();
    }
}
