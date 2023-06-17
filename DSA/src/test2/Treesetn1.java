package test2;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetn1 {

    void Treesett(){

        TreeSet<String> s1 = new TreeSet<>();
        s1.add("BBB");
        s1.add("CCC");
        s1.add("AAAA");

        System.out.println(s1.contains("AAAA"));
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()){

            System.out.println(i1.next());
        }
    }

    public static void main (String[] args) {
        Treesetn1 t1 = new Treesetn1();
        t1.Treesett();


    }
}
