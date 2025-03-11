package Advance.Collection;

import java.util.ArrayList;
import java.util.List;

/*
Method	                    Description
add(E element)	            Adds an element to the end of the list.
add(int index, E element)	Inserts an element at the specified index.
get(int index)	            Retrieves the element at the specified index.
remove(int index)	        Removes the element at the specified index.
remove(Object obj)	        Removes the first occurrence of the specified object.
setEx(int index, E element)	Replaces the element at the specified index with the new element.
contains(Object obj)	    Checks if the list contains the specified element.
size()	                    Returns the number of elements in the list.
indexOf(Object obj)	        Returns the index of the first occurrence of the specified object.
isEmpty()	                Checks if the list is empty.
 */

public class arrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicates are allowed

//        System.out.println(fruits.get(3));
//
//        for(String f:fruits){
//            System.out.println(f);
//        }

        System.out.println(fruits.set(3,"Chiko"));
//        System.out.println(fruits.);
        System.out.println(fruits);

    }
}
