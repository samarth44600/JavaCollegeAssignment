import java.util.Scanner;

public class HoursToMinutesConverter_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours: ");
        int hours = scanner.nextInt();

        int minutes = hours * 60;

        System.out.println("Minutes: " + minutes);

        scanner.close();
    }
}
