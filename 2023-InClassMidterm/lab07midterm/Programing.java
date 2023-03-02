package lab07midterm;
import java.util.Scanner;

public class Programing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        char operand = in.next().charAt(0);
        double b = in.nextDouble();
        
        double result = 0;
        switch (operand) {
            case '+':
                result = a+b;
                break;
            case '*':
                result = a*b;
            default:
                break;
        }
        System.out.println(result);
        in.close();
    }
}
