import java.util.Scanner;

public class TaxCalculator_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the annual salary: ");
        double salary = scanner.nextDouble();

        double tax = 0.0;
        double actualAmount = 0.0;

        if (salary <= 400000) {
            tax = salary * 0.01;
        } else if (salary > 400000 && salary <= 500000) {
            tax = salary * 0.1;
        } else {
            tax = salary * 0.2;
        }

        actualAmount = salary - tax;

        System.out.println("Tax amount: " + tax);
        System.out.println("Actual amount received: " + actualAmount);
    }
}
