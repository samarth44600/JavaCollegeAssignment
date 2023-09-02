// Create an array of integers with a fixed size. Try to access an element at an index that is
// outside the valid range of the array (e.g., a negative index or an index greater than the array
// size). Use exception handling to capture and handle the
// ArrayIndexOutOfBoundsException.

package assignment6;

public class ArrayIndexOutOfBoundsExceptionExample6 {
    public static void main(String[] args) {
        try {
            // Create an array of integers with a fixed size
            int[] numbers = { 1, 2, 3, 4, 5 };

            // Attempt to access an element at an invalid index
            int invalidIndex = 6;
            int element = numbers[invalidIndex]; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        System.out.println("Program continues to execute after handling the exception.");
    }
}

// Output
// ArrayIndexOutOfBoundsException caught: Index 6 out of bounds for length 5
// Program continues to execute after handling the exception.
