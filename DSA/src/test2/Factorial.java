package test2;

public class Factorial {

    static int fact(int x){
        int res = 1;
        for (int i = 2; i <= x; i++) {
            res = res*i;
        }
        return res;

    }

    public static void main (String[] args) {
        System.out.println(fact(6));

    }
}
