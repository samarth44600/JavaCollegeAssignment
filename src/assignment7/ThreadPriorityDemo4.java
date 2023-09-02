// Develop a program that creates multiple threads with different priorities using the Thread
// class. Observe and explain how thread priorities affect thread scheduling and execution.

package assignment7;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running - iteration " + i);
        }
    }
}

public class ThreadPriorityDemo4 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        // Set different priorities for the threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1 (lowest)
        thread2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        thread3.setPriority(Thread.MAX_PRIORITY); // Priority 10 (highest)

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
