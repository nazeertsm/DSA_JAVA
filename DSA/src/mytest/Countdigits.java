package mytest;

public class Countdigits {

    static int cntdigi(int x){

        int res=0;
        while (x>0){
            x= x/10;
            res++;

        }
        return res;

    }

    public static void main (String[] args) {

        System.out.println(cntdigi(123223));

    }
}
