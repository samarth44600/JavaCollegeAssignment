// Create a program that displays your name 10 times using thread. Extend Thread class in
// your program.

package assignment7;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Your Name");
        }
    }
}

public class DisplayName1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        // Start the thread
        thread.start();

        // Main thread continues its execution
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }
}

// Output
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Main Thread
// Your Name
// Your Name
// Your Name
// Your Name
// Your Name
// Your Name
// Your Name
// Your Name
// Your Name
// Your Name