package Mathematics;
//Euclidean Algorithm Code
public class Gcd1 {

    static int gcdcal(int a, int b)
    {
        while(a!=b)
        {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

    public static void main (String[] args) {

        int a = 12, b = 15;

        System.out.println(gcdcal(a, b));

    }
}
