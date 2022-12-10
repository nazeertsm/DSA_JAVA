package JavaArrays;

import java.util.Vector;

public class Vector_demo {
    public static void main(String[] arg)
    {
        // Create a vector
        Vector<Integer> v = new Vector<Integer>();

        // Insert elements in the Vector
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(3);

        // Print the Vector
        System.out.println("Vector is " + v);
    }
}





























/*
* Vector Class in Java

The Vector class implements a growable array of objects. Vectors basically falls in legacy classes but now it is fully compatible with collections.
Vector implements a dynamic array that means it can grow or shrink as required. Like an array, it contains components that can be accessed using an integer index.
They are very similar to ArrayList but Vector is synchronized and has some legacy method, which the collection framework does not contain.
It extends AbstractList and implements List interfaces.


Constructor:
Vector(): Creates a default vector of initial capacity 10.
Vector(int size): Creates a vector whose initial capacity is specified by size.
Vector(int size, int incr): Creates a vector whose initial capacity is specified by size and the increment is specified by incr. It specifies the number of elements to allocate each time a vector is resized upwards.
Vector(Collection c): Creates a vector that contains the elements of collection c.*/