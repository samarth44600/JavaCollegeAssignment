// Develop a program that showcases the functionality of HashSet. Create a HashSet of
// strings, add elements, remove elements, and check for the presence of specific elements.

package assignment9;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();

        // Add elements to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");

        // Print the original set
        System.out.println("Original HashSet:");
        printSet(stringSet);

        // Check if an element is present
        String searchElement = "Banana";
        boolean isPresent = stringSet.contains(searchElement);
        System.out.println("'" + searchElement + "' is present: " + isPresent);

        // Remove an element
        String removeElement = "Cherry";
        boolean isRemoved = stringSet.remove(removeElement);
        System.out.println("'" + removeElement + "' is removed: " + isRemoved);

        // Print the updated set
        System.out.println("HashSet after removing '" + removeElement + "':");
        printSet(stringSet);
    }

    // Method to print elements of a HashSet
    private static void printSet(HashSet<String> set) {
        for (String element : set) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
