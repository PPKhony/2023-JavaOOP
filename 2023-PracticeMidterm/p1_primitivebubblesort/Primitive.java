package p1_primitivebubblesort;
//goal sort from less to more
public class Primitive {
    private int a = 2;
    private int b = 1;
    private int c = 6;
    private int d = -99;
    private int e = -1;
    
    private int length = 5;
    public void printSortNumberBubble() {
        for (int i = 0; i < length; i++) {
            int temp;
                if (a>b) {temp = a ; a = b ; b = temp;}
                if (b>c) {temp = b ; b = c ; c = temp;}
                if (c>d) {temp = c ; c = d ; d = temp;}
                if (d>e) {temp = d ; d = e ; e = temp;}
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println("end"+i);
        }
    }
}
