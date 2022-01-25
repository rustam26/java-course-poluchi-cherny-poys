package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> set =new HashSet<>();

        set.add("Rustam");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");

        set.remove("Oleg");
        System.out.println(set);

        for (String s:set){
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Rustam"));
        System.out.println(set);
    }
}
