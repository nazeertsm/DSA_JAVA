package Hash;

// Java program to demonstrate
// the working of Map interface
import java.util.*;

public class HashMap1 {
    public static void main(String args[])
    {
        // Creating instance of hashmap
        Map<Integer, String> m
                = new HashMap<>();

        // Addig values into the map
        m.put(100, "GfG");
        m.put(200, "Courses");
        m.put(150, "IDE");

        // Displaying the treemap
        System.out.println(m);
    }
}
