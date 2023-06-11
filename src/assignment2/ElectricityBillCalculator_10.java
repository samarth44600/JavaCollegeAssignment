import java.util.Scanner;

public class ElectricityBillCalculator_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the consumption units: ");
        int units = scanner.nextInt();

        double billAmount = 0.0;

        if (units <= 150) {
            billAmount = units * 3.0;
        } else if (units <= 350) {
            billAmount = 150 * 3.0 + (units - 150) * 3.75;
        } else if (units <= 450) {
            billAmount = 150 * 3.0 + 200 * 3.75 + (units - 350) * 4.0;
        } else {
            billAmount = 150 * 3.0 + 200 * 3.75 + 100 * 4.0 + (units - 450) * 4.25;
        }

        System.out.println("Electricity bill amount: Rs. " + billAmount);
    }
}
