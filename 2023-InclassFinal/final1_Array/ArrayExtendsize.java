package final1_Array;
import java.util.*;

public class ArrayExtendsize{
    public static int[] doubleCapacity(int[] d) {
        int[] a = new int[2*d.length];
        for (int i=0; i<d.length; i++) {
            a[i] = d[i];
        }        
        System.out.println("Extend Capacity success " + a.length);   
        return a;
    }

    public static void main(String[] args) {
        int[] obj1 = new int[2];
        int count = 33;
        while (count > obj1.length) {
            obj1 = doubleCapacity(obj1);
        }

;       for (int i = 0; i < count; i++) {
            obj1[i] = i;
            System.out.println(obj1[i]);
        }
    }
}
