// Write a Java program that creates a reference to an object but doesn't initialize it. Attempt
// to perform an operation (e.g., calling a method or accessing a field) on this uninitialized
// reference. Implement exception handling to catch and handle the resulting
// NullPointerException.

package assignment6;

public class UninitializedException5 {
    public static void main(String[] args) {
        try {
            // Declare a reference to an object without initializing it
            String uninitializedString = null;

            // Attempt to perform an operation on the uninitialized reference
            int length = uninitializedString.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        System.out.println("Program continues to execute after handling the exception.");
    }
}

// Output
// NullPointerException caught: null
// Program continues to execute after handling the exception