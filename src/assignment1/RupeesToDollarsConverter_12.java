import java.util.Scanner;

public class RupeesToDollarsConverter_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in Rupees: ");
        double rupees = scanner.nextDouble();

        double exchangeRate = 0.014; // Exchange rate: 1 Rupee = 0.014 Dollar

        double dollars = rupees * exchangeRate;

        System.out.println("Amount in Dollars: " + dollars);

        scanner.close();
    }
}
