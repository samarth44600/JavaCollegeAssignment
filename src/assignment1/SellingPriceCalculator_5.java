import java.util.Scanner;
 public class SellingPriceCalculator_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marked price of the radio: ");
        double markedPrice = scanner.nextDouble();

        double discount = 0.3; // 30% discount
        double discountAmount = markedPrice * discount;
        double sellingPrice = markedPrice - discountAmount;

        System.out.println("Actual selling price: " + sellingPrice);

        scanner.close();
    }
}
