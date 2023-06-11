import java.util.Scanner;

public class CircleCalculator_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        scanner.close();
    }
}
