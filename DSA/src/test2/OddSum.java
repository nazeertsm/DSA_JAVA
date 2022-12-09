package test2;

import java.util.Scanner;

public class OddSum {

    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element of the array");

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();

        }

        int odd = 0, even = 0, sum = 0;

        for (int num : arr) {

            if (num % 2 == 1) {
                int temp = odd; //swap odd and even
                odd = even;
                even = temp;
                odd++;
            } else {
                even++;
            }
            sum += odd;
        }
        System.out.println(sum);

    }


}





    /*Q2. Given an integer array arr, return the number of consecutive sequences(subarrays) with odd sum.

        Explanation:
        Odd + odd gives even sum, even + odd gives odd sum, even + even gives even sum
        • If we know the number of even and odd subarrays that end at the previous element, we can figure out how
        many even and odd subarrays we have for element n.
        • If n is even, we increase the number of even subarrays; the number of odd subarrays does not change.
        • If n is odd, the number of odd subarrays is the previous number of even subarrays + l. The number of even
        subarrays is the previous number of odd subarrays.
        Enter the length of the array: 3
        Enter the element of the array : 1 3 5-->4

        */