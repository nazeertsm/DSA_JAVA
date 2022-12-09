package recursion;

public class Factorial {

    static int fact(int x) {

        if (x == 0)
            return 1;
        return x * fact(x - 1);
    }


    public static void main (String[] args) {
        System.out.println(fact(5));

    }
}
/*
* fact(5)
*   5*fact(4)
*       4*fact(3)
*           3*fact(2)
*               2*fact(1)
*                   1*fact(0)
*
*
* */