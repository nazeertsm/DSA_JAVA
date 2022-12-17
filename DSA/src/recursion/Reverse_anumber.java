package recursion;

public class Reverse_anumber {

    static void Reversenum(int n){
        if(n==0)
            return;
        System.out.println(n);
        Reversenum(n-1);

    }

    public static void main (String[] args) {
        Reversenum(5);

    }
}
