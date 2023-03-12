import java.util.*;
// import java.util.concurrent.CountDownLatch;

public class CS300Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] obj1 = new int[count];
        for (int i = 0; i < count; i++) {
            obj1[i] = in.nextInt();
        }
        double temp = 0.0;
        Arrays.sort(obj1);
        if (count>3) {
            temp = Math.round(count*0.3);
        } else;
        

        double sum = 0.0;
        for (int i = 0; i < temp; i++) {
            sum += obj1[i];
        }

        sum = sum/temp;
        System.out.println((int)sum);

        in.close();

    }
}
