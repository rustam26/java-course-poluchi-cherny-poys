package collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Double, Student> map = new LinkedHashMap<>(16,0.75f,true);
        Student st1 = new Student("Rustam", "Kosimov", 4);
        Student st2 = new Student("Maria", "Sidorov", 4);
        Student st3 = new Student("Elena", "Ifimova", 4);

        map.put(7.5, st1);
        map.put(5.5, st2);
        map.put(1.5, st3);

        System.out.println(map);

        System.out.println(map.get(1.5));
        System.out.println(map.get(7.5));

        System.out.println(map);
    }

}
