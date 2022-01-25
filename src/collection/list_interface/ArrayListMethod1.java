package collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethod1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList1= new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1,"Misha");

        System.out.println(arrayList1);
        arrayList1.remove(0 );


        for(String s: arrayList1){
            System.out.println(s );
        }

    }
}
