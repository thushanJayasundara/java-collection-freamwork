package itarable.collection.list;

import java.util.LinkedList;

/**
 * Explanation:
 * 	LinkedList<String> cities = new LinkedList<>(); → Creates a LinkedList of type String.
 * 	add() → Adds elements at the end of the list.
 * 	addFirst() / addLast() → Adds elements at the beginning or end of the list.
 * 	getFirst() / getLast() → Retrieves the first or last element.
 * 	removeFirst() / removeLast() → Removes the first or last element.
 * 	contains(Object) → Checks if an element exists.
 * 	size() → Returns the number of elements.
 * 	clear() → Removes all elements.
 * 	isEmpty() → Checks if the list is empty.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> cities = new LinkedList<>();

        // Adding elements to the LinkedList
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");

        // Displaying the LinkedList
        System.out.println("Cities List: " + cities);

        // Adding elements at first and last positions
        cities.addFirst("Sydney");
        cities.addLast("Dubai");
        System.out.println("After adding at first and last: " + cities);

        // Accessing elements
        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());

        // Removing elements
        cities.removeFirst();
        cities.removeLast();
        System.out.println("After removing first and last: " + cities);

        // Iterating over the LinkedList
        System.out.println("Iterating over the LinkedList:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Checking if an element exists
        System.out.println("Does the list contain Paris? " + cities.contains("Paris"));

        // Getting the size of the LinkedList
        System.out.println("Size of the LinkedList: " + cities.size());

        // Clearing the LinkedList
        cities.clear();
        System.out.println("Is the LinkedList empty? " + cities.isEmpty());
    }
}