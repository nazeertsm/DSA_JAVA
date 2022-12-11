package JavaArrays.ArrayListN;

import java.util.ArrayList;

public class ArrayListStr1 {

    public static void main (String[] args) {
        ArrayList<String> als = new ArrayList<String>();
        als.add("Red");
        als.add("Blue");
        als.add("Black");
        System.out.println(als); //[Red, Blue, Black]
        als.remove(0);
        System.out.println(als); //Blue, Black]
//To remove all the elements in the ArrayList, use the clear() method:
        als.clear();
        System.out.println(als); //[]


    }


}
