// Write a Java program that demonstrates the use of ArrayList. Create an ArrayList of
// integers, add elements to it, remove elements, and print the final list. Handle cases where
// the list might be empty or contain duplicate elements.

package assignment9;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        // Add elements to the ArrayList
        System.out.println("Enter integers to add to the list (enter a non-integer to finish):");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            numberList.add(num);
        }

        // Check if the list is empty
        if (numberList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            // Print the original list
            System.out.println("Original List:");
            printList(numberList);

            // Remove duplicate elements
            removeDuplicates(numberList);

            // Print the list after removing duplicates
            System.out.println("List after removing duplicates:");
            printList(numberList);
        }

        scanner.close();
    }

    // Method to remove duplicate elements from an ArrayList
    private static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        list.clear();
        list.addAll(uniqueList);
    }

    // Method to print elements of an ArrayList
    private static void printList(ArrayList<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
