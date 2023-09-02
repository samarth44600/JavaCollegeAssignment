// Create an abstract class Shape, inside the class create an abstract method draw(). Create
// two class Circle and Rectangle extending class Shape, in the class Circle and Rectangle
// override the function draw(). In class Circle, the draw function should display “Circle
// Drawn” and in the class Rectangle, the function should display “Rectangle Drawn”.
// Create another class Geometry which contains the main function, from the main function
// create instances of the two class Circle and Rectangle and call the method draw().

package assignment3;

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle Drawn");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Drawn");
    }
}

public class Geometry3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.draw(); // Calls the draw method of the Circle class
        rectangle.draw(); // Calls the draw method of the Rectangle class
    }
}





// Output
// Circle Drawn
// Rectangle Drawn