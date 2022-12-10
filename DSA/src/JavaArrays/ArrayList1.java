package JavaArrays;

import java.io.IOException;
import java.util.ArrayList;

// Java program to demonstrate working of
// ArrayList in Java
public class ArrayList1 {
    public static void main(String[] args)
            throws IOException
    {
        // size of ArrayList
        int n = 5;

        // declaring ArrayList with initial size n
        java.util.ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying ArrayList after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (int i=0; i<arrli.size(); i++)
            System.out.print(arrli.get(i)+" ");
    }
}
