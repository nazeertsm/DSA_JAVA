package JavaArrays.ArrayListN;

import java.util.ArrayList;

public class ArrayList2 {

    public static void main (String[] args) {
        // declaring ArrayList
        ArrayList<Integer> al = new ArrayList<>();

        System.out.println(al.size()); //0
        al.add(10); //Appends the specified element to the end of this list.
        al.add(40);
        al.add(20);
        System.out.println(al); //[10, 40, 20]
        System.out.println(al.size()); //3

        al.add(1,100); //    index – index at which the specified element is to be inserted
                                       //    element – element to be inserted
        System.out.println(al);



    }
}
