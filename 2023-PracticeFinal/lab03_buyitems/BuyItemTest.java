package lab03_buyitems;
/**
 * BuyItemTest
 */
import java.util.*;
public class BuyItemTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] arr = new double[6];
        
        for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
        }

        in.close();

        BuyItem item = new BuyItem();
        item.getPrice(arr);
        item.displayInfo();
        
    }
}