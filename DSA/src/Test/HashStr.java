package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashStr {

    public static void main (String[] args) {

        Set<String> s1 = new HashSet<String>();
        s1.add("Nazeer");
        s1.add("Ahmed");
        s1.add("MLG");

        Iterator<String> itr= s1.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }

    }
}