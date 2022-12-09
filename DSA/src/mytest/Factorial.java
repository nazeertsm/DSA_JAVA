package mytest;

public class Factorial {

    static int fact(int x){

        int res = 1;
        int i=2;
        while (i<=x){
            res = res*i;
            i=i+1;
        }
       return res;
    }

    public static void main (String[] args) {

        System.out.println(fact(6));
    }
}
