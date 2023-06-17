package Collection;

import java.util.LinkedList;

public class LinkedList1 {

    public static void main (String[] args) {

        LinkedList l1 = new LinkedList();
        l1.add(100);
        l1.add(200);
        l1.add("Nazeer");
        l1.addFirst("f1");
        l1.addLast("last1");
        System.out.println(l1);  // [f1, 100, 200, Nazeer, last1]
    }
}
