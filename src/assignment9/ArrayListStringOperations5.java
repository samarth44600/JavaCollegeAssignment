// Create a Java program that utilizes an ArrayList of strings:
// a. Initialize an empty ArrayList to store strings.
// b. Allow the user to add strings to the list.
// c. Implement functionality to remove a string by its index.
// d. Display the contents of the list after each operation

package assignment9;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStringOperations5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a string");
            System.out.println("2. Remove a string by index");
            System.out.println("3. Display the list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to add: ");
                    String newString = scanner.nextLine();
                    stringList.add(newString);
                    break;
                case 2:
                    if (!stringList.isEmpty()) {
                        System.out.print("Enter the index of the string to remove: ");
                        int indexToRemove = scanner.nextInt();
                        if (indexToRemove >= 0 && indexToRemove < stringList.size()) {
                            stringList.remove(indexToRemove);
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("The list is empty.");
                    }
                    break;
                case 3:
                    System.out.println("Current List:");
                    displayList(stringList);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    // Method to display the contents of an ArrayList of strings
    private static void displayList(ArrayList<String> list) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Index " + i + ": " + list.get(i));
            }
        } else {
            System.out.println("The list is empty.");
        }
    }
}
