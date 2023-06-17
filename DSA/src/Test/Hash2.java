package Test;

import java.util.HashMap;
import java.util.Map;

public class Hash2 {
  void hashMethod1 (){

        HashMap<Integer, String> h1 = new HashMap<>();
        h1.put(100, "Hundred");
        h1.put(200, "2Hundred");
        h1.put(300, "3Hundred");
        hashMethod2(h1);

    }
    void hashMethod2 (HashMap<Integer, String> h1) {

        for (Map.Entry<Integer, String>e:h1.entrySet()){
            System.out.println(e.getKey());

       }
    }

    public static void main (String[] args) {

       Hash2 s1  = new Hash2();
        s1.hashMethod1();
     }
  }
