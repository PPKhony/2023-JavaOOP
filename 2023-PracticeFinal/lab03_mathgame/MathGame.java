package lab03_mathgame;
import java.lang.Math;
public class MathGame {
    public static void main(String[] args) {
        int count = 50;
        int i = 0;
        int j = 0;
        int k = 0;
        double x = 0;
        for (i = 1; i <= count; i++) {
            for (j = 1; j <= count; j++) {
                for (k = 1; k <= count; k++) {
                    if ((Math.pow(i, 2)+Math.pow(j, 2)==Math.pow(k, 2) )&& i <= count && j <= count & k <= count) {
                        if (x!=(Math.pow(i, 2)+Math.pow(j, 2)+Math.pow(k, 2))) {
                            System.out.println(i + " " + j + " " + k);
                        }
                        x = Math.pow(i, 2)+Math.pow(j, 2)+Math.pow(k, 2);
                    }
                }
            }
        }
    }
}
