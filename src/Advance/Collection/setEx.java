package Advance.Collection;

import java.util.*;

/*
| **Method**                | **Description**                                       |
| `add(E element)`          | Adds an element to the Set (if not already present). |
| `remove(Object obj)`      | Removes the specified element from the Set. |
| `contains(Object obj)`    | Checks if the Set contains the specified element. |
| `isEmpty()`               | Checks if the Set is empty. |
| `size()`                  | Returns the number of elements in the Set. |
| `clear()`                 | Removes all elements from the Set. |
| `addAll(Collection c)`    | Adds all elements from a collection to the Set (removing duplicates). |
| `retainAll(Collection c)` | Retains only the elements in the Set that are contained in the specified collection. |
| `removeAll(Collection c)` | Removes all elements from the Set that are contained in the specified collection. |
 */

public class setEx {
    public static void main(String[] args) {
//        Set<String> fruits = new LinkedHashSet<>();
//        Set<String> fruits = new TreeSet<>();
        Set<String> fruits = new HashSet<>();

        // Add elements to the Set
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicate, will not be added

        // Display the Set
        System.out.println("Set: " + fruits);

        // Check if an element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the Set.");
        }

        // Remove an element
        fruits.remove("Cherry");

        // Iterate through the Set
        System.out.println("Remaining elements:");
        //Itreating using Itreator
//        Iterator<String> val = fruits.iterator();
//        while (val.hasNext()){
//            System.out.println(val.next());
//        }
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
