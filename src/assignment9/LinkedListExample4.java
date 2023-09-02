// Develop a Java program that uses an LinkedList of integers:
// a. Generate a random list of integers (at least 10 elements).
// b. Find and print the largest element in the list.
// c. Implement error handling in case the list is empty.

package assignment9;

import java.util.LinkedList;
import java.util.Random;

public class LinkedListExample4 {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        Random random = new Random();

        // Generate a random list of integers (at least 10 elements)
        int listSize = 10;
        for (int i = 0; i < listSize; i++) {
            integerList.add(random.nextInt(100)); // Generate random integers between 0 and 99
        }

        // Find and print the largest element in the list
        try {
            int largestElement = findLargestElement(integerList);
            System.out.println("Random List of Integers: " + integerList);
            System.out.println("Largest Element in the List: " + largestElement);
        } catch (EmptyListException e) {
            System.err.println("Error: The list is empty.");
        }
    }

    // Method to find the largest element in a LinkedList of integers
    private static int findLargestElement(LinkedList<Integer> list) throws EmptyListException {
        if (list.isEmpty()) {
            throw new EmptyListException("The list is empty.");
        }

        int largest = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }
}

// Custom exception class for an empty list
class EmptyListException extends Exception {
    public EmptyListException(String message) {
        super(message);
    }
}
