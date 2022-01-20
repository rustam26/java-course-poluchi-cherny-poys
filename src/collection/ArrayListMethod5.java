package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1= new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        System.out.println(arrayList1);

        List<Integer> list1 = List.of(3,8,13);
        System.out.println(list1);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
//        Object[] array = arrayList1.toArray();
//        String[] array2 = arrayList1.toArray(new String[0]);
//
//        for (String s : array2){
//            System.out.println(s);
//        }

//        ArrayList<String> arrayList2= new ArrayList<>();
//        arrayList2.add("Ivan");
//        arrayList2.add("Mariya");
//        arrayList2.add("Igor");


        //arrayList1.removeAll(arrayList2);
        //arrayList1.retainAll(arrayList2);

//        System.out.println(arrayList1);

//        boolean result =arrayList1.containsAll(arrayList2);
//        System.out.println(result);
//
//        List<String> myList = arrayList1.subList(0,3);
//        myList.add("Fedor");
//        System.out.println(myList);
//        System.out.println(arrayList1);
    }
}
