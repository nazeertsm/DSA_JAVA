package Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue1 {

    Queue<Integer> QueueTEST() {

        Queue<Integer> s1 = new ArrayDeque<Integer>();
        s1.offer(12);
        s1.offer(124);
        s1.offer(123);

        return s1;


    }

    public static void main (String[] args) {

        Queue1 q1 = new Queue1();
        Queue<Integer> d1= q1.QueueTEST();
        System.out.println(d1);

        System.out.println(d1.size());
        System.out.println(d1.isEmpty());
        System.out.println(d1);
        System.out.println(d1.contains(124));
        System.out.println(d1.peek());
        d1.remove(12);
        System.out.println(d1.peek());
        System.out.println(d1.poll());




    }
}
