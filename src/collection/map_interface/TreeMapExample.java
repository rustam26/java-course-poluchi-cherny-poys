package collection.map_interface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap <Student, Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Rustam", "Kosimov", 4);
        Student st2 = new Student("Maria", "Sidorov", 4);
        Student st3 = new Student("Igor", "Hubaev", 4);
        Student st4 = new Student("Ivan", "Vaniev", 4);
        Student st5 = new Student("Anton", "Ifimova", 4);
        Student st6 = new Student("Inna", "Ivanova", 4);
        Student st7 = new Student("Sasha", "Ifimova", 4);

        treeMap.put(st1, 2.8);
        treeMap.put(st2, 3.3);
        treeMap.put(st3, 8.7);
        treeMap.put(st4, 5.4);
        treeMap.put(st5, 6.4);
        treeMap.put(st6, 0.4);
        treeMap.put(st7, 9.4);
        System.out.println(treeMap);

//        System.out.println(treeMap.descendingMap());
//
//        System.out.println(treeMap.tailMap(7.3));
//        System.out.println(treeMap.headMap(7.3));
//
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
//
    }
}
