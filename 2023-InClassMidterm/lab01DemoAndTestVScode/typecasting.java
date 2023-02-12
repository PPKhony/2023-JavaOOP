package lab01DemoAndTestVScode;
public class typecasting {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        float c = a+b;
        System.out.println(c); //แบบนี้แปล อัตโนมัติ 

        float x = 5;
        float y = 10;
        int z = (int)x + (int)y ;
        System.out.println(z); //แบบนี้ error ต้องทำ type casting 
    }
}
