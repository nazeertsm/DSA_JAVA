package Tree;

// Java program to find ceiling on right side for
// every element.
import java.util.*;

public class TreeSetDemo {
    public static void printCeilingRight(int[] arr)
    {
        int n = arr.length;
        TreeSet<Integer> s = new TreeSet<Integer>();
        int[] res = new int[n];

        // Find smallest greater or equal element
        // for every array element
        for (int i = n - 1; i >= 0; i--) {
            Integer ceil = s.ceiling(arr[i]);
            if (ceil == null)
                res[i] = -1;
            else
                res[i] = ceil;
            s.add(arr[i]);
        }

        for(int x: res)
        {
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {100, 50, 30, 60, 55, 32};
        printCeilingRight(arr);
    }
}
