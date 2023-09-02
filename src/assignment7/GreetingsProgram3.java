// Write a program to create two task where on task is to print ten greetings “Hello, World”,
// one greeting every second and another task is to print “Goodbye, World”. Start two
// threads one that prints “Hello, World” and one that prints “Goodbye,World”. Use
// sleep(milliseconds) method

package assignment7;

class HelloThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, World");
            try {
                Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class GoodbyeThread extends Thread {
    public void run() {
        System.out.println("Goodbye, World");
    }
}

public class GreetingsProgram3 {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        GoodbyeThread goodbyeThread = new GoodbyeThread();

        // Start the "Hello, World" thread
        helloThread.start();

        // Sleep for a while to ensure "Hello, World" prints first
        try {
            Thread.sleep(500); // Sleep for 0.5 seconds (500 milliseconds)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the "Goodbye, World" thread
        goodbyeThread.start();
    }
}
