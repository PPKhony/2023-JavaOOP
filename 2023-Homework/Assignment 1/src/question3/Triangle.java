package question3;
import java.lang.Math;

public class Triangle {
    private int a = 0;
    private int b = 0;
    private int c = 0;

    public void setA(int a) {
        if (a<=0) {
            System.out.println("Error please enter 'a' more than 0");
            System.exit(0); 
        }
        this.a = a;
    }
    public void setB(int b) {
        if (b<=0) {
            System.out.println("Error please enter 'b' more than 0");
            System.exit(0); 
        }
        this.b = b;
    }
    public void setC(int c) {
        if (c<=0) {
            System.out.println("Error please enter 'c' more than 0");
            System.exit(0); 
        }
        this.c = c;
    }
    
    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getC() {
        return this.c;
    }

    public double calculateArea() {
        double s = (this.a+ this.b + this.c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }

    public boolean isSquareTriangle() {
        if (Math.pow(this.c, 2) != Math.pow(this.a, 2) + Math.pow(this.b, 2)) {
            return true;
        } else {
            return false;
        }
    }
    
}
