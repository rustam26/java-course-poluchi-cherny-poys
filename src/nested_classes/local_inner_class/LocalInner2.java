package nested_classes.local_inner_class;

public class LocalInner2 {

    public static void main(String[] args) {


        class Slojenie implements Math2{
            @Override
            public int doOperations(int a, int b) {
                return a+b;
            }
        }

        Slojenie slojenie = new Slojenie();
        System.out.println(slojenie.doOperations(5,3));
    }
}

interface Math2{

    int doOperations(int a, int b);

}
