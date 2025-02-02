package itarable.collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue (Min-Heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        pq.offer(30);
        pq.offer(10);
        pq.offer(50);
        pq.offer(20);

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Peeking the highest priority element (smallest in this case)
        System.out.println("Peek (top element): " + pq.peek());

        // Removing elements based on priority (smallest first)
        System.out.println("Polling elements from PriorityQueue:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}