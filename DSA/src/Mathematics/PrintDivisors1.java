package Mathematics;
//A Naive Solution would be to iterate all the numbers from 1 to n, checking if that number
// divides n and printing it. Below is a program for the same:
// Java implementation of Naive method to print all divisors
public class PrintDivisors1 {

    // method to print the divisors
    static void print_Divisors1(int n)
    {
        for (int i=1;i<=n;i++)
            if (n%i==0)
                System.out.print(i+" ");
    }

    // Driver method
    public static void main(String args[])
    {
        System.out.println("The divisors of 100 are: ");
        print_Divisors1(100);;
    }
}
