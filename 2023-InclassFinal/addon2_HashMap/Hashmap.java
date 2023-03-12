package addon2_HashMap;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> myobj1 = new HashMap<String , Integer>();
        myobj1.put("Mazda", 50);
        System.out.println(myobj1.get("Mazda"));
    }
}
