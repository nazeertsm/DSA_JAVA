package Test;

import java.util.HashMap;

public class HashMapThread {

    public static void main (String[] args) {
          HashMap<String, Integer> map = new HashMap<>();
            map.put("Alice", 25);
            map.put("Bob", 30);

            // start two threads that modify the HashMap concurrently
            Thread thread1 = new Thread(() -> {
                map.put("Charlie", 35);
            });
            Thread thread2 = new Thread(() -> {
                map.put("David", 40);
            });
            thread1.start();
            thread2.start();

            // wait for the threads to finish
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // print the contents of the HashMap
            for (String name : map.keySet()) {
                int age = map.get(name);
                System.out.println(name + " is " + age + " years old");
            }
        }
    }

/*
In this example, we create a HashMap called map and add two entries to it. We then start two threads that modify
the HashMap concurrently by adding two more entries. Finally, we print the contents of the HashMap.
When you run this program, you might get different outputs each time, depending on how the threads are scheduled.
For example, one possible output is:

csharp
Copy code
Bob is 30 years old
David is 40 years old
Charlie is 35 years old
Alice is 25 years old
This output shows that the HashMap was modified concurrently by two threads, resulting in a corrupted internal state and an unpredictable output.
To make HashMap thread-safe, you can use a synchronized wrapper, such as Collections.synchronizedMap() or use a thread-safe alternative such as ConcurrentHashMap.
Regenerate response
* */