package Test;

import java.util.HashSet;
import java.util.Set;

public class Sample1 {
    public Set<Integer> S1 () {

        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(10);
        s1.add(20);
        s1.add(30);

        return s1;
    }

    public Set<Integer> S2 () {

        Set<Integer> s2 = new HashSet<Integer>();
        s2.add(40);
        s2.add(50);
        s2.add(10);

        return s2;
    }

    public static void main (String[] args) {

        Sample1 t1 = new Sample1();
        Set<Integer> s11= t1.S1();
        Set<Integer> s22= t1.S2();

       //s11.addAll(s22);  //union
       //System.out.println(s11);
       //s11.retainAll(s22); //intersection
        //System.out.println(s11);
        s11.removeAll(s22);
        System.out.println(s11);



    }
}