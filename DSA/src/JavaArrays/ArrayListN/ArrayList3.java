package JavaArrays.ArrayListN;

import java.util.ArrayList;

public class ArrayList3 {

    public static void main (String[] args) {

        ArrayList<String> als2 = new ArrayList<>();
        als2.add("Red");
        als2.add("Yellow");
        als2.add("Green");
        int n = als2.size();
        for (int i = 0; i < n; i++) {
            System.out.println("als2_" + i + " = " + als2.get(i));
        }
        //remove the Yellow string and print the value
        int k;
        for (k = 0; k < als2.size(); k++) {
            if (als2.get(k).equals("Yellow")) {
                als2.remove(k);
                System.out.println("Yellow removed");
            }
        }
        System.out.println("list after remove yellow: als2" + als2);

    }

}

