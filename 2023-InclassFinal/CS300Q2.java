import java.util.*;
public class CS300Q2 {
    public static void main(String[] args) {
        int[] a = {5,6,7,1,3,9,0,-5,9999};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        ArrayList<String> obj2 = new ArrayList<>();
        obj2.add("bird");
        obj2.add("ant");
        obj2.add("apple");
        obj2.add("zebra");
        obj2.add("cat");
        Collections.sort(obj2);

        for (int i = 0; i < obj2.size(); i++) {
            System.out.println(obj2.get(i));
        }
    }
}
