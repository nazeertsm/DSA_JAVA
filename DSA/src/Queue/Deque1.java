package Queue;

// Java program to demonstrate the working
// of a Deque in Java
import java.util.*;

public class Deque1 {
    public static void main(String[] args)
    {
        Deque<Integer> d = new LinkedList<Integer>();

        // Adds element to front of queue
        d.offerFirst(10);

        // Adds element to end of queue
        d.offerLast(20);

        // Adds element to front of queue
        d.offerFirst(5);

        // Adds element to end of queue
        d.offerLast(15);

        // Retrieve the head element
        System.out.println(d.peekFirst());

        // Retrieve the tail element
        System.out.println(d.peekLast());

        // Retrieve and remove the head element
        d.pollFirst();

        // Retrieve and remove the tail element
        d.pollLast();

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());
    }
}

/*
A Deque (short for Double Ended Queue) is a data structure in Java that allows elements to be inserted and removed
from both the front and rear of the queue. It is part of the Java Collections framework and is implemented by the
Deque interface, which extends the Queue interface. Deque provides methods such as addFirst(), addLast(),
removeFirst(), removeLast() to insert and remove elements from either end of the queue.
 Common implementations of Deque include ArrayDeque and LinkedList.
* */