package collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1= new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2= new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");

        arrayList1.addAll(1,arrayList2);
        System.out.println(arrayList1);
        //arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println(arrayList1.indexOf("Ivan"));
        System.out.println(arrayList1.lastIndexOf("Ivan"));
        System.out.println(arrayList1.isEmpty());
        System.out.println(arrayList1.contains("Zaur"));


    }
}
