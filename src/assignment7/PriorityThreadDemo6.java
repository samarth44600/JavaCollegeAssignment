// Write a program that creates two threads. Set priority maximum to first thread and
// minimum to second thread. Start the thread and analyze the output.

package assignment7;

class HighPriorityThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("High Priority Thread: Iteration " + i);
        }
    }
}

class LowPriorityThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Low Priority Thread: Iteration " + i);
        }
    }
}

public class PriorityThreadDemo6 {
    public static void main(String[] args) {
        HighPriorityThread highPriorityThread = new HighPriorityThread();
        LowPriorityThread lowPriorityThread = new LowPriorityThread();

        // Set maximum priority for the first thread
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        // Set minimum priority for the second thread
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        // Start both threads
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}
