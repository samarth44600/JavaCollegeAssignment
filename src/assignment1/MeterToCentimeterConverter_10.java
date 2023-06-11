import java.util.Scanner;

public class MeterToCentimeterConverter_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length in meters: ");
        double meters = scanner.nextDouble();

        double centimeters = meters * 100;

        System.out.println("Length in centimeters: " + centimeters);

        scanner.close();
    }
}
