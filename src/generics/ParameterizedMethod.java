package generics;

import java.util.ArrayList;

public class ParameterizedMethod {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(5);

        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("One");
        arrayList2.add("Two");
        arrayList2.add("Three");

        String s = GenMethod.getSecondElement(arrayList2);
        System.out.println(s);


    }

}

class GenMethod{

    public static <T> T getSecondElement(ArrayList<T> a1){
        return a1.get(1);
    }

}
