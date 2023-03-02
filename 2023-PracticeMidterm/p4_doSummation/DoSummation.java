package p4_doSummation;
import java.util.*;
import java.lang.*;

public class DoSummation {
    public static void main(String[] args) {
        int x1;
        int x2;

        Scanner kuy = new Scanner(System.in);
        x1 = kuy.nextInt();
        x2 = kuy.nextInt();

        System.out.printf("%s%s",(x1<x2)? x1:x2,(x1>=x2)? x1:x2);
        kuy.close();
    }
}
