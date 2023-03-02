package lab06Array;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Array รู้ค่า แต่ไม่รู้ขนาด
        int[] number;
        int numberSize;
        numberSize = in.nextInt();
        number = new int[numberSize];

        //เราสามารถสร้างให้ใหญ่เกินจริงเพื่อรองรับการขยายตัวได้
        //เราสามารถ implement validation เพื่อกัน index out of bound ได้
        if (numberSize >= number.length) {
            System.out.println("Array is full");
        }

        in.close();
        //เราสามารถ Extend Array ได้โดยการสร้าง Array ใหม่แล้ว copyมาไว้
        

    }
}
