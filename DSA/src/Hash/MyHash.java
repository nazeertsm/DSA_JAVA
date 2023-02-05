package Hash;

// Java program to demonstrate implementation of our
// own hash table with chaining for collision detection
import java.util.*;

class MyHash
{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table; //Create Array of Linked List
    MyHash(int b)  //user to specify bucket variable value, we create an array list, then we add empty array list of the linked list
    {
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for (int i=0; i<b; i++)
            table.add(new LinkedList<Integer>());
    }
    void insert(Integer k)  //taking the key in insert function
    {
        int i = k % BUCKET; //applying simple Hash function,//10%7 = 3(remainder), insert the value 10 in 3rd index
        table.get(i).add(k); //go to the index of array list and insert the given key
    }
    boolean search(Integer k)
    {
        int i = k % BUCKET;
        return table.get(i).contains(k);
    }
    void delete(Integer k)
    {
        int i = k % BUCKET;   //10%7 = 3(remainder), insert the value 10 in 3rd index
        table.get(i).remove(k);
    }
}

class GFG
{
    // Driver method to test Map class
    public static void main(String[] args)
    {
        MyHash mh = new MyHash(7); //bucket size 7(index 0 to 6)
        mh.insert(10);
        mh.insert(20);
        mh.insert(15);
        mh.insert(7);
        System.out.println(mh.search(10));
        mh.delete(15);
        System.out.println(mh.search(15));
    }
}

/*
*
* */
