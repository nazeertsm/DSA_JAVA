package mytest;

public class Palindrome1 {

    static boolean isPalindrome(int x){
        int temp = x;
        int rev = 0;

        while (temp!=0){
        int last_degit = temp%10;
        rev =rev*10+last_degit;
        temp = temp/10;

        }
        return (rev ==x);

    }
    public static void main (String[] args) {
        System.out.println(isPalindrome(7672));

    }
}
