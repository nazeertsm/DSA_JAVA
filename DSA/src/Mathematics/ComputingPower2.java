package Mathematics;
/* Function to calculate x raised to the power y in
 * O(logn)*/
public class ComputingPower2 {
    /* Function to calculate x raised to the power y */
    static int power(int x, int y)
    {
        int temp;
        if (y == 0)
            return 1;
        temp = power(x, y / 2);
        if (y % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }

    // Driver code
    public static void main(String[] args)
    {
        int x = 2;
        int y = 3;

        // Function call
        System.out.printf("%d", power(x, y));
    }
}

/*
 * An Optimized Divide and Conquer Solution:
 * The problem can be recursively defined by:
 *
 * power(x, n) = power(x, n / 2) * power(x, n / 2);        // if n is even
 * power(x, n) = x * power(x, n / 2) * power(x, n / 2);    // if n is odd
 * However there is a problem with the above solution, the same subproblem is computed twice for each recursive call. We can optimize the above
 * function by computing the solution of the subproblem once only.
 */
