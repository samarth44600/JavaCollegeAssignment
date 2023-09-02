// Write a program that uses the Runnable interface to create multiple threads that access
// shared resources concurrently. Implement synchronization mechanisms (e.g.,
// synchronized methods or locks) to ensure proper thread safety.

package assignment7;

class Counter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to decrement the count
    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }
}

class IncrementThread implements Runnable {
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class DecrementThread implements Runnable {
    private Counter counter;

    public DecrementThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }
    }
}

public class ThreadSafetyDemo8 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread incrementThread = new Thread(new IncrementThread(counter));
        Thread decrementThread = new Thread(new DecrementThread(counter));

        incrementThread.start();
        decrementThread.start();

        incrementThread.join();
        decrementThread.join();

        System.out.println("Final Count: " + counter.getCount());
    }
}
