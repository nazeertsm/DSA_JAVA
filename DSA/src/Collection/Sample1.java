package Collection;

import java.util.ArrayList;

public class Sample1 {

    public static void main (String[] args) {

        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add("Nazeer");
        //System.out.println(al1);
        ArrayList al2 = new ArrayList();
        al2.add(500);
        al2.add(600);
        al2.add("Ahmed");
        //System.out.println(al2);
        al1.addAll(al2);
        System.out.println(al1); //[100, 200, Nazeer, 500, 600, Ahmed]

        al1.add(2, "second_index");
        System.out.println(al1);

        System.out.println(al1.get(2));



    }
}
