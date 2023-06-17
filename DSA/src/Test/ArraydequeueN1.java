package Test;

import java.util.ArrayDeque;

public class ArraydequeueN1 {

    public static void main (String[] args) {

        ArrayDeque ad1 = new ArrayDeque<>();
        ad1.add(100);
        ad1.add(400);
        ad1.add(200);
        System.out.println(ad1);
        System.out.println(ad1.contains(100)); //true
        System.out.println(ad1.getLast()); //200
        System.out.println(ad1);
    }
}
