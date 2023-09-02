// Write a program that demonstrate inter-thread communication. (you can refer to slide)

package assignment7;

class SharedResource {
    private String message;
    private boolean messageProduced;

    public synchronized void produce(String msg) {
        if (messageProduced) {
            try {
                wait(); // Wait for the consumer to consume the message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        message = msg;
        messageProduced = true;
        System.out.println("Producer produced: " + msg);
        notify(); // Notify the consumer that a message is available
    }

    public synchronized String consume() {
        if (!messageProduced) {
            try {
                wait(); // Wait for the producer to produce a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String msg = message;
        messageProduced = false;
        System.out.println("Consumer consumed: " + msg);
        notify(); // Notify the producer that the message has been consumed
        return msg;
    }
}

class Producer extends Thread {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedResource.produce("Message " + (i + 1));
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            String msg = sharedResource.consume();
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class InterThreadCommunicationDemo7 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        producer.start();
        consumer.start();
    }
}
