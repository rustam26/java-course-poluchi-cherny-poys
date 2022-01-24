package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(100, "Rustam Kosimov");
        map1.put(1000, "Zaur Tregulov");
        map1.putIfAbsent(1000, "Irina Leonova");
        map1.put(8952, "Ivan Ivanov");
        map1.put(8655, "Ivan Ivanov");
        map1.put(null, "Ivan Ivanov");
        map1.put(45,null );

        System.out.println(map1);
        System.out.println(map1.get(100));
        System.out.println(map1.remove(100));
        System.out.println(map1.keySet());
    }
}
