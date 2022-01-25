package collection.list_interface;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1= new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2= new ArrayList<>(200);
    }
}
