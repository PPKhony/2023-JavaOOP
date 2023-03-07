package final1_Array;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayServices {
    public static void main(String[] args) {
        int[] a = new int[30];
        int[] b = new int[30];
        Random rand = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
        }
        Arrays.sort(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println(" ");
    
        int i = Arrays.binarySearch(a, 40);
        System.out.println("binarysearch " + i);

        Arrays.copyOf(a, 10);
       
        System.arraycopy(a, 0, b, 0, 15);
        System.out.println(b[1]);
    }
}
