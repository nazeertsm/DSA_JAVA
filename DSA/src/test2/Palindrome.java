package test2;

public class Palindrome {

    static boolean isPalindrome(int n){
        int rev = 0;
        int temp = n;

        while (temp!=0){

            int last_degit = temp%10; //get the last degit
            rev = rev*10+last_degit;
            temp = temp/10;  //remove the last degit for next iteration

        }
        return (rev==n);

    }
    public static void main (String[] args) {

        System.out.println(isPalindrome(7678));

    }
}
