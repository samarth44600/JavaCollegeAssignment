// Create an interface called Calculate which has methods int add(int x, int y) and int diff(int
// x, int y) to perform addition and subtraction of numbers passed as arguments. Then
// define a class that implements interface calculate.

package assignment5;

// Define the Calculate interface
interface Calculate {
    int add(int x, int y);

    int diff(int x, int y);
}

// Create a class that implements the Calculate interface
class Calculator implements Calculate {
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int diff(int x, int y) {
        return x - y;
    }
}

// classname = AddDiff

public class AddDiff5 {
    public static void main(String[] args) {
        // Create an instance of the Calculator class
        Calculate calculator = new Calculator();

        // Use the implemented methods
        int sum = calculator.add(10, 5);
        int difference = calculator.diff(10, 5);

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}

// Output
// Sum: 15
// Difference: 5
