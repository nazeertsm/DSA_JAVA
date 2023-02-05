package test2.array;

import java.util.ArrayList;

public class IntArrList2 {

    static void IntArrList_2(){
        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(20);
        al.add(98);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));

            
        }

    }

    public static void main (String[] args) {
        IntArrList_2();
    }
}
