package mytest;

public class Palindrome2 {

   static boolean isBoolean(int x){
        int rev = 0;
       int temp = x;

       while (temp!=0){
           int last_deg = temp%10;
           rev = rev*10+last_deg;
           temp = temp/10;

       }

       return (rev ==x);

    }

    public static void main (String[] args) {

        System.out.println(isBoolean(121));

    }
}
