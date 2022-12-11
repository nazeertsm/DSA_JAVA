package JavaArrays.largestelt;

import java.io.IOException;

// Java Program to find maximum in arr[]
public class Largest_inthegiven_array2 {
    static int arr[] = {10, 324, 45, 90, 9808};

    // Method to find maximum in arr[]
    static int largest()
    {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    // Driver method
    public static void main(String[] args)
    {

        System.out.println("Largest in given array is " + largest());
    }
}


/*
Approach 2 – Linear Traversal: One of the most simplest and basic approach to solve this problem is to simply traverse
the whole list and find the maximum among them.

Follow the steps below to implement this idea:

Create a local variable max to store the maximum among the list
Initialize max with the first element initially, to start the comparison.
Then traverse the given array from second element till end, and for each element:
Compare the current element with max
If the current element is greater than max, then replace the value of max with the current element.
At the end, return and print the value of the largest element of array stored in max.
Below is the implementation of the above approach:
* */