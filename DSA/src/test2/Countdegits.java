package test2;

public class Countdegits {

    int countDigits (int x) { //Takes the integer x is an arguments

        int res = 0;
        while (x > 0) {  //when you get the zero, come out of the loop

            x = x / 10; //removed the last degit until x is zero
            res++;  //increment the result
        }

        return res; //returns the count of an integer

    }

    public static void main (String[] args) {

        Countdegits countN = new Countdegits();
        int x = 34528;

        System.out.print("Number of digits : " + countN.countDigits(x));

    }
}
