package Test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ProrityQueueN1 {

    public static void main (String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(200);
        pq.add(300);
        pq.add(400);
        Iterator bq = pq.iterator();
        while (bq.hasNext()){
          System.out.println(bq.next());
         }

    }
}
