package lab02Controlstatement.exercise3;
import java.util.Scanner;
public class DoSummation {
    public static void main(String[] args) {
        Calculator obj01 = new Calculator();
        
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();

        in.close();
        
        System.out.println(obj01.sumBetween2Integers(x1, x2));
    }
}
