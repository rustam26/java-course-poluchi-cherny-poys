package nested_classes.local_inner_class;

public class LocalInner1 {

    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21,4);

    }

}

class Math {
    private int a = 10;

    public void getResult(final int delimoe,final int delitel) {


        class Delenie {

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                System.out.println(a);
                return delimoe % delitel;
            }

//            public int getDelimoe() {
//                return delimoe;
//            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

//            public int getDelitel() {
//                return delitel;
//            }
//
//            public void setDelitel(int delitel) {
//                this.delitel = delitel;
//            }

        }


        Delenie delenie = new Delenie();
        //delenie.setDelimoe(21);
        System.out.println("Delimoe = " + delimoe);
        System.out.println("Delitel = " + delenie);
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatok = " + delenie.getOstatok());
    }
}
