package Queue;

// Java program to demonstrate working of
// ArrayDeque in Java
import java.util.ArrayDeque;

public class Deque5 {
    public static void main(String args[])
    {
        // Creating empty ArrayDeque
        ArrayDeque<Integer> ad
                = new ArrayDeque<Integer>();

        // Adding items to the ad using add()
        ad.add(10);
        ad.add(20);
        ad.add(30);

        System.out.println(ad);
    }
}
