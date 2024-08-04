package Java;

import java.util.LinkedList;
import java.util.Queue;

// Shared buffer class
class Buffer {
    private final int capacity;
    private final Queue<Integer> queue = new LinkedList<>();

    public Buffer(int capacity) {
        this.capacity = capacity;
    }

    // Producer adds items to the buffer
    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); // Buffer is full, wait for consumer to consume
        }
        queue.add(item);
        notifyAll(); // Notify consumer that new item is available
    }

    // Consumer removes items from the buffer
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // Buffer is empty, wait for producer to produce
        }
        int item = queue.poll();
        notifyAll(); // Notify producer that space is available
        return item;
    }
}

// Producer class
class Producer implements Runnable {
    private final Buffer buffer;
    private int item = 0;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.produce(item++);
                System.out.println("Produced: " + (item - 1));
                Thread.sleep(100); // Simulate time to produce an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Consumer class
class Consumer implements Runnable {
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int item = buffer.consume();
                System.out.println("Consumed: " + item);
                Thread.sleep(1500); // Simulate time to consume an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

// Main class to start the producer and consumer threads
public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(10); // Create a buffer with a capacity of 10

        // Create and start producer and consumer threads
        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
