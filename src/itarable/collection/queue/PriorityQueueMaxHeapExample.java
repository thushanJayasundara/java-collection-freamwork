package itarable.collection.queue;

import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueMaxHeapExample {
    public static void main(String[] args) {
        // Creating a Max-Heap using a Comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Adding elements
        maxHeap.offer(30);
        maxHeap.offer(10);
        maxHeap.offer(50);
        maxHeap.offer(20);

        // Displaying the PriorityQueue
        System.out.println("Max-Heap: " + maxHeap);

        // Removing elements (largest first)
        System.out.println("Polling elements from Max-Heap:");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}