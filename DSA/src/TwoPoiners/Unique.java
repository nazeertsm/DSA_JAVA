package TwoPoiners;

import java.util.Arrays;
import java.util.Scanner;

public class Unique {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of m");
        int m = scn.nextInt();
        System.out.println("Enter value of n");
        int n = scn.nextInt();
        int[] arr = new int[n]; //store the n integer in an array

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }
        Arrays.sort(arr); //on sorting , same integer will be aligned in consecutive indices
        int i = 0;
        int count = 0;
        while (i < n) {
            count++;

            while (i < n - 1 && arr[i + 1] == arr[i]) {  //skip duplicate of element
                i++;
            }
            i++; //increment 1more as i was still pointing to the last duplicate of previous element
        }
        if (count >= m) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
/* Q1: Given an integer m, n, and n integers, return true, if the number of unique integers among the n integer is greater than or equal to m,
 * else return false, (integer appearing multiple times are all considered as 1 unique integer)
 *  1214521122
 *  Expected output : false
 *
 * Explanation:
 * Store the integer an array and sort the array
 * sort will align duplicates together
 * keep am index pointer initialized with 0
 * Increment count for the element, now check up till what index is the element getting repeated,
 * and jump to the last index of its occurrence using a while loop
 * Increment index by 1 more so you can get the next index new element and increment count whenever you are out of your inner loop
 *5
 * 10
 * 1 2 1 4 5 2 1 1 2 2 false
 */
