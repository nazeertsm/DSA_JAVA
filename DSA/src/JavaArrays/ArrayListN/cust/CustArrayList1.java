package JavaArrays.ArrayListN.cust;
import java.util.ArrayList;

class Person{
     private String name;

    public Person(String name) {
        this.name = name;
    }
    public String toString(){
        return  name;

    }
}
public class CustArrayList1 {

    public static void main (String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("nazeer"));
        people.add(new Person("ahmed"));
        people.set(0, new Person("Hello"));
        for (Person x: people) {
            System.out.println(x);
        }

    }
}
