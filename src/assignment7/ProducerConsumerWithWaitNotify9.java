// Create a scenario where one thread produces data, and another thread consumes the data.
// Use the wait() and notify() or BlockingQueue mechanism to coordinate communication
// between these threads.

package assignment7;

import java.util.LinkedList;
import java.util.Queue;

class DataBuffer {
    private Queue<Integer> buffer = new LinkedList<>();
    private int maxSize;

    public DataBuffer(int maxSize) {
        this.maxSize = maxSize;
    }

    public synchronized void produce(int data) throws InterruptedException {
        while (buffer.size() == maxSize) {
            // Buffer is full, wait for the consumer to consume data
            wait();
        }
        buffer.offer(data);
        System.out.println("Produced: " + data);
        notify(); // Notify the consumer that data is available
    }

    public synchronized int consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            // Buffer is empty, wait for the producer to produce data
            wait();
        }
        int data = buffer.poll();
        System.out.println("Consumed: " + data);
        notify(); // Notify the producer that space is available in the buffer
        return data;
    }
}

class ProducerThread extends Thread {
    private DataBuffer dataBuffer;

    public ProducerThread(DataBuffer dataBuffer) {
        this.dataBuffer = dataBuffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                dataBuffer.produce(i);
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class ConsumerThread extends Thread {
    private DataBuffer dataBuffer;

    public ConsumerThread(DataBuffer dataBuffer) {
        this.dataBuffer = dataBuffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                int data = dataBuffer.consume();
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ProducerConsumerWithWaitNotify9 {
    public static void main(String[] args) {
        DataBuffer dataBuffer = new DataBuffer(3); // Buffer size of 3

        ProducerThread producerThread = new ProducerThread(dataBuffer);
        ConsumerThread consumerThread = new ConsumerThread(dataBuffer);

        producerThread.start();
        consumerThread.start();
    }
}
