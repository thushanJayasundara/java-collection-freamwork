package itarable.collection.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements at both ends
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);

        // Displaying the deque
        System.out.println("Deque: " + deque);

        // Removing elements from both ends
        System.out.println("Removed first: " + deque.pollFirst());
        System.out.println("Removed last: " + deque.pollLast());

        // Displaying the updated deque
        System.out.println("Updated Deque: " + deque);
    }
}