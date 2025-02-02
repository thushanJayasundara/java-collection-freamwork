package itarable.collection.list;
/**
 * 	Explanation:
 * 	push(E e) → Adds an element to the top of the stack.
 * 	pop() → Removes and returns the top element.
 * 	peek() → Returns the top element without removing it.
 * 	search(Object o) → Returns the position of an element (1-based index).
 * 	isEmpty() → Checks if the stack is empty.
 */

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack of Integers
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the Stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Displaying the Stack
        System.out.println("Stack: " + stack);

        // Peeking the top element
        System.out.println("Top element (peek): " + stack.peek());

        // Popping an element (removes top element)
        System.out.println("Popped element: " + stack.pop());

        // Displaying the Stack after pop
        System.out.println("Stack after pop: " + stack);

        // Checking if an element exists
        System.out.println("Does the stack contain 20? " + stack.contains(20));

        // Checking if the Stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Iterating over the Stack
        System.out.println("Iterating over the Stack:");
        for (Integer num : stack) {
            System.out.println(num);
        }
    }
}