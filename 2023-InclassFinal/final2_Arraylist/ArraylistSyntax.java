package final2_Arraylist;
import java.util.*;

public class ArraylistSyntax {
    public static void main(String[] args) {
        ArrayList<String> myobj = new ArrayList<>();
        //<Datatype> ตรง new จะใส่หรือไม่ใส่ก็ได้ใน version ใหม่

        myobj.add(0,"Apple");
        System.out.println(myobj.get(0));
        
        ArrayList<Integer> obj2 = new ArrayList<>(); 
        obj2.add(0,5);
        
        
    }
}
