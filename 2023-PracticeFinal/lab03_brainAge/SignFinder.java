
/*
 * Reference โจทย์จากหนังสือ Lab Java CU pdf page 29
 */
import java.util.*;
public class SignFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        if (numbers[2]==(numbers[1]+numbers[0])) {
            System.out.println("Synbol is +");
        } if (numbers[2]==(numbers[0]-numbers[1])) {
            System.out.println("Synbol is -");
        } if (numbers[2]==(numbers[1]*numbers[0])) {
            System.out.println("Symbol is *");
        } if (numbers[2]==(numbers[0]/numbers[1])) {
            System.out.println("Symbol is /");
        }
        in.close();
    }
}
