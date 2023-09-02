// Create an interface Shape which has methods get_data() and display_area(). Create two
// classe Triangle and circle which implements this interface. Define the instance variables
// of these classes as per requirement in class itself. Create some instances of Triangle and
// demonstrate interface implementation by classes.

package assignment3;

// Define the Shape interface
interface Shape {
    void get_data();

    void display_area();
}

// Create a class Triangle that implements the Shape interface
class Triangle implements Shape {
    private double base;
    private double height;
    private double area;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void get_data() {
        area = 0.5 * base * height;
    }

    @Override
    public void display_area() {
        System.out.println("Triangle Area: " + area);
    }
}

// Create a class Circle that implements the Shape interface
class Circle implements Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void get_data() {
        area = Math.PI * radius * radius;
    }

    @Override
    public void display_area() {
        System.out.println("Circle Area: " + area);
    }
}

// classname = ShapeArea
public class ShapeArea6 {
    public static void main(String[] args) {
        // Create instances of Triangle and Circle
        Triangle triangle = new Triangle(5.0, 4.0);
        Circle circle = new Circle(3.0);

        // Calculate and display areas of the shapes
        triangle.get_data();
        triangle.display_area();

        circle.get_data();
        circle.display_area();
    }
}

// Output
// Triangle Area: 10.0
// Circle Area: 28.274333882308138