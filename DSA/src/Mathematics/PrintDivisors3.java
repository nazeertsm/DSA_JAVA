package Mathematics;
/*package whatever //do not write package name here */
public class PrintDivisors3 {

    static void print_Divisors3(int n)
    {
        for(int i=1; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                System.out.print(i+" ");

                if(i != n / i)
                    System.out.print((n / i)+" ");
            }
        }
    }

    public static void main (String[] args) {

        int n = 100;
        //int n = 25;

        print_Divisors3(n);

    }
}

