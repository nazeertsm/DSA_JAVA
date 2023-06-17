package Queue;

// Java program to demonstrate the working
// of Reversal Traversal of Deque in Java
import java.util.*;

public class Deque4 {
    public static void main(String[] args)
    {
        Deque<Integer> d = new LinkedList<Integer>();

        // Adds element to front of queue
        d.addFirst(10);

        // Adds element to end of queue
        d.addLast(20);

        // Adds element to front of queue
        d.addFirst(5);

        // Adds element to end of queue
        d.addLast(15);

        // Traversal using Iterator
        Iterator it = d.descendingIterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");

    }
}
