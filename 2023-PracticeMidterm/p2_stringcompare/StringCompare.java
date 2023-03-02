package p2_stringcompare;

public class StringCompare {
    private String a = "Hello";
    private String b = "World";
    private String c = "Apple";
    private String d = "apple";
    
    public void displayInfo() {
        System.out.println(a.compareTo(b)); // Hello มาก่อน World
        System.out.println(b.compareTo(c)); // World มาหลัง Apple
        System.out.println(c.compareTo(d)); // Apple มาก่อน apple 
    }
}
