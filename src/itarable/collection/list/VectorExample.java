package itarable.collection.list;
/**
 *  Explanation:
 * 	Thread-Safety: Unlike ArrayList, Vector is synchronized.
 * 	Dynamic Resizing: When it reaches its capacity, it grows twice its size.
 * 	Methods Specific to Vector:
 * 	firstElement() / lastElement()
 * 	addElement(E e) (similar to add())
 * 	capacity() (returns the total capacity)
 * 	removeElement(E e) (removes a specific element)
 */

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector of Strings
        Vector<String> animals = new Vector<>();

        // Adding elements to the Vector
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        animals.add("Lion");

        // Displaying the Vector
        System.out.println("Animals List: " + animals);

        // Adding an element at a specific position
        animals.add(2, "Tiger");
        System.out.println("After adding Tiger at index 2: " + animals);

        // Accessing elements
        System.out.println("First animal: " + animals.firstElement());
        System.out.println("Last animal: " + animals.lastElement());

        // Removing an element
        animals.remove("Elephant");
        System.out.println("After removing Elephant: " + animals);

        // Iterating over the Vector
        System.out.println("Iterating over the Vector:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Checking if an element exists
        System.out.println("Does the list contain Lion? " + animals.contains("Lion"));

        // Getting the size of the Vector
        System.out.println("Size of the Vector: " + animals.size());

        // Clearing the Vector
        animals.clear();
        System.out.println("Is the Vector empty? " + animals.isEmpty());
    }
}