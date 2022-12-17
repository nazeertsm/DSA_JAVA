package recursion;

public class PrintN {
    static void printN_Numbers(int n){
        if (n==0)
            return;
        printN_Numbers(n-1);

        System.out.println(n);

    }
    public static void main (String[] args) {
        printN_Numbers(5);
    }
}