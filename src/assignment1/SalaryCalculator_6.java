import java.util.Scanner;

public class SalaryCalculator_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        double taxPercentage = 0.2; // 20% tax
        double allowancePercentage = 0.4; // 40% allowance

        double tax = basicSalary * taxPercentage;
        double allowance = basicSalary * allowancePercentage;
        double netSalary = basicSalary + allowance - tax;

        System.out.println("Tax: " + tax);
        System.out.println("Allowance: " + allowance);
        System.out.println("Net Salary: " + netSalary);

        scanner.close();
    }
}
