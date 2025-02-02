package itarable.collection.list;

import java.util.ArrayList;

/**
 * Explanation:
 * ArrayList<String> fruits = new ArrayList<>(); → Creates an ArrayList of type String.
 * add() → Adds elements to the list.
 * get(index) → Retrieves an element at the specified index.
 * remove(Object) → Removes an element by value.
 * contains(Object) → Checks if an element is present in the list.
 * size() → Returns the number of elements in the list.
 * clear() → Removes all elements from the list.
 * isEmpty() → Checks if the list is empty.
 */

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Displaying the ArrayList
        System.out.println("Fruits List: " + fruits);

        // Accessing elements from the ArrayList
        System.out.println("First fruit: " + fruits.get(0));

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterating over the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if an element exists
        System.out.println("Does the list contain Mango? " + fruits.contains("Mango"));

        // Getting the size of the ArrayList
        System.out.println("Size of the ArrayList: " + fruits.size());

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("Is the ArrayList empty? " + fruits.isEmpty());
    }
}


