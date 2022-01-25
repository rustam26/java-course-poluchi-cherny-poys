package collection.set_interface;

import java.util.HashSet;

public class HashSetExample2 {

    public static void main(String[] args) {
        HashSet <Integer> hashSet1 = new HashSet<>();

        hashSet1.add(5);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(1);
        hashSet1.add(8);

        HashSet <Integer> hashSet2 = new HashSet<>();

        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

        HashSet <Integer> hashSetUnion = new HashSet<>(hashSet1);

        hashSetUnion.addAll(hashSet2);
        System.out.println(hashSetUnion);

        HashSet <Integer> hashSetIntersect = new HashSet<>(hashSet1);

        hashSetIntersect.retainAll(hashSet2);
        System.out.println(hashSetIntersect);


        HashSet <Integer> hashSetSubtract = new HashSet<>(hashSet1);

        hashSetSubtract.removeAll(hashSet2);
        System.out.println(hashSetSubtract);
    }
}
