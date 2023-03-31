package lab06_HanoiTower;

public class Hanoi {
    public static void h(int n, String a , String b, String c) {
        if (n!=0) {
            h(n-1, a, c, b);
            System.out.println("move " + n + " : "+ a + " -> "+ c);
            h(n-1, b, a, c);
        } 
        else;
    }
    public static void main(String[] args) {
        h(10,"a","b","c");
    }
}
























































