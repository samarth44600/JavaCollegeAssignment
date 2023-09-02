// Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create
// a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a
// method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create
// an object for each of the subclasses and call their respective methods.

package assignment3;

abstract class Animals {
    public abstract void cats();

    public abstract void dogs();
}

class Cats extends Animals {
    @Override
    public void cats() {
        System.out.println("Cats meow");
    }

    @Override
    public void dogs() {
        // Since Cats class is not supposed to have a 'dogs' method, we provide an empty
        // implementation.
    }
}

class Dogs extends Animals {
    @Override
    public void cats() {
        // Since Dogs class is not supposed to have a 'cats' method, we provide an empty
        // implementation.
    }

    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }
}

// Class name = CatDog
public class CatDog2 {
    public static void main(String[] args) {
        Cats cat = new Cats();
        Dogs dog = new Dogs();

        cat.cats(); // Calls the 'cats' method in Cats class
        dog.dogs(); // Calls the 'dogs' method in Dogs class
    }
}

// Output
// Cats meow
// Dogs bark
