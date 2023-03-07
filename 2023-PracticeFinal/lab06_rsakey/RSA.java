package lab06_rsakey;

public class RSA {
    public static int powerMod(int a, int b, int m) {
        if(b==0) return 1;
        else return (a*powerMod(a, b-1, m)) %m;
    } // ไม่ามารถทำแบบนี้ได้เพราะจะทำให้เกิด StackOverflowError

    public static int powerMod2 (int a, int b, int m) {
        if (b == 0) return 1;
        
        int p = powerMod2(a, b / 2, m);
        p = (p * p) % m;
        
        if (b % 2 == 1) p = (a * p) % m; //เลขคี่
        return p; //เลขคู่
    }
    public static void main(String[] args) {
        int a = powerMod2(2, 1000001, 11);
        System.out.println(a);
    }
}
