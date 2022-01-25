package collection.map_interface;

import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {
        Hashtable <Double, Student> hashtable = new Hashtable<>();
        Student st1 = new Student("Rustam", "Kosimov", 4);
        Student st2 = new Student("Maria", "Sidorov", 4);
        Student st3 = new Student("Elena", "Ifimova", 4);

        hashtable.put(7.5, st1);
        hashtable.put(5.5, st2);
        hashtable.put(1.5, st3);

        System.out.println(hashtable);
    }

}
