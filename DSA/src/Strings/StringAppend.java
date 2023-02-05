package Strings;

public class StringAppend {

    public static void main (String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append("World!");
        System.out.println(sb); // prints "Hello World!"

    }
}

/*append() is a method in the Java StringBuilder class that allows you to add content to the end of an existing string.
The method takes a variety of data types (such as strings, numbers, and characters)
 as an argument and appends them to the end of the existing string

 StringBuilder is a class in Java that allows for the efficient modification (such as appending and inserting) of strings.
  It is often used when concatenating many strings together, as it is more efficient than
  using the + operator on strings, which creates a new object each time it is used.
 */