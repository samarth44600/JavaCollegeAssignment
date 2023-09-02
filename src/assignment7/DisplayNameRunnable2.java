// Create the same program as above by implementing Runnable class.

package assignment7;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Your Name");
        }
    }
}

public class DisplayNameRunnable2 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        // Create a thread using the MyRunnable instance
        Thread thread = new Thread(myRunnable);

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
// Main Thread
// Main Thread
// Main Thread
// Main Thread