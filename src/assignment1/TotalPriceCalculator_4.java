import java.util.Scanner;

public class TotalPriceCalculator_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of quantities: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble();

        double totalPrice = quantity * price;

        System.out.println("Total price: " + totalPrice);

        scanner.close();
    }
}
