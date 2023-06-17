package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueueN {
    public static void main (String[] args) {

        // create a new deque
        Deque<String> deque = new LinkedList<>();

        // add elements to the front of the deque
        deque.addFirst("one");
        deque.addFirst("two");
        deque.addFirst("three");

        // add elements to the back of the deque
        deque.addLast("four");
        deque.addLast("five");
        deque.addLast("six");

        // print the deque
        System.out.println("Deque: " + deque);

        // remove elements from the front of the deque
        String first = deque.removeFirst();
        System.out.println("Removed first element: " + first);

        String second = deque.removeFirst();
        System.out.println("Removed second element: " + second);

        // remove elements from the back of the deque
        String last = deque.removeLast();
        System.out.println("Removed last element: " + last);

        // print the deque again
        System.out.println("Deque after removal: " + deque);
    }
    }

