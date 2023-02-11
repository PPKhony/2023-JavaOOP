package lab02Controlstatement.exercise1;
import java.util.Scanner;

public class DoSummation {
    public static void main(String[] args) {
        int x1;
        int x2;
        int result = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter first integer");
        x1 = in.nextInt();
        System.out.print("Please enter second integer");
        x2 = in.nextInt();
        in.close();

        for (int i = x1; i <= x2; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
