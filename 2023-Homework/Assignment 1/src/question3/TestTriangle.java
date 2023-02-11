package question3;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setA(3);
        t1.setB(4);
        t1.setC(5);
        System.out.printf("Area of Triangle with sides (%d.00,%d.00,%d.00) = %.2f",t1.getA(),t1.getB(),t1.getC(),t1.calculateArea());
    }
}
