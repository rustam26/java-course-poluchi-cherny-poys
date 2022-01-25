package nested_classes.anonymous_class;

public class AnonymousClass {

    private int x = 5;

    public static void main(String[] args) {

        Math m = new Math() {
            int c = 10;
            void abc(){}
            @Override
            public int doOperations(int a, int b) {
                AnonymousClass ac= new AnonymousClass();
                return a+b +ac.x;
            }
        };

        Math m2 = new Math() {
            @Override
            public int doOperations(int a, int b) {
                return a*b;
            }
        };

        System.out.println(m.doOperations(3,6));
        System.out.println(m2.doOperations(3,6));

    }
}


interface Math{

    int doOperations(int a, int b);

}
