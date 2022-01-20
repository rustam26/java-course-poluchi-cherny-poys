package generics;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

    public int i;
    public static void main(String[] args) {



        List<?> list= new ArrayList<String>();

        List<Double> list1 = new ArrayList<>();

        List<? extends Number> list3 = new ArrayList<Integer>();

        list1.add(3.11);
        list1.add(3.15);
        list1.add(3.18);

        showInfo(list1);


        List<String> list2 = new ArrayList<>();

        list2.add("JK");
        list2.add("IK");
        list2.add("KK");
        showInfo(list2);

        ArrayList<Double>ald = new ArrayList<>();


        ald.add(3.11);
        ald.add(3.15);
        ald.add(3.18);

        System.out.println(summ(ald));
    }

    static void showInfo(List<?> list){
        System.out.println(list);
    }

    public static double summ (ArrayList<? extends Number> al){
        double summ =0;

        for (Number n: al){
            summ+=n.doubleValue();
        }
        return summ;
    }

}

