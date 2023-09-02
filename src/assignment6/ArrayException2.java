// What happens when you try to access element 9 of a 7-element array?

// public class MyClass {
// public static void main(String args[]){
// int myArray[] = new int[7];
// // trying to access element 9
// System.out.println(myArray[9]);
// System.out.println(“rest of the code”);
// }
// }
// Handle the exception so that code will run to the end.

package assignment6;

public class ArrayException2 {
    public static void main(String args[]) {
        int myArray[] = new int[7];

        try {
            // Trying to access element 9
            System.out.println(myArray[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Array index is out of bounds.");
        }

        System.out.println("Rest of the code");
    }
}

// Output
// Array index is out of bounds.
// Rest of the code