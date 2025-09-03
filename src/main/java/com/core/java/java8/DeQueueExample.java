package com.core.java.java8;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueueExample {
    public static void main(String[] args) {
        //ArrayDequeue is not thread safe, null is not allowed
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Cherry");// Adding element to the font
        deque.push("Banana"); // Push is equivalent to addFirst
        //deque.push(null); // null is not allows
        deque.addLast("Apple"); // adding elements to the rear
        deque.offer("Date"); // Offer is equivalent to addlast
        System.out.println("Dequeue after addition: "+deque);
        //Removing Elements from the front
        String firstElement = deque.removeFirst();
        System.out.println("Removed first: "+firstElement);
        System.out.println("Dequeue after remove first: "+deque);
        //Peeking at elements
        System.out.println("First element (peek) "+deque.peekFirst());
        System.out.println("Last element (peek) "+ deque.peekLast());
    }
}
