package lambda;

public class Test2 {

    static void def (I i){
        System.out.println(i.abc("privet"));
    }

    public static void main(String[] args) {
        final int i=10;
         def((String s) -> {
             System.out.println(i);
             return s.length()+10;});
    }

}

interface I {
    int abc(String s);
}
