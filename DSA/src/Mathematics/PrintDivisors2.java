package Mathematics;
// A Better (than Naive) Solution to find all divisors
public class PrintDivisors2 {

    // method to print the divisors
    static void print_Divisors2(int n)
    {
        // Note that this loop runs till square root
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i)
                    System.out.print(" "+ i);

                else // Otherwise print both
                    System.out.print(i+" " + n/i + " " );
            }
        }
    }

    // Driver method
    public static void main(String args[])
    {
        System.out.println("The divisors of 100 are: ");
        print_Divisors2(100);;
    }
}


/*
* Can we improve the above solution?
If we look carefully, all the divisors are present in pairs. For example if n = 100, then the various pairs of divisors are: (1,100), (2,50), (4,25), (5,20), (10,10)
Using this fact we could speed up our program significantly.
We, however, have to be careful if there are two equal divisors as in the case of (10, 10). In such case, we’d print only one of them.
* */