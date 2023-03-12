import java.util.*;

public class CS300Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String[] splitring = name.split(" ");
        String gen = in.nextLine();
    
        if (gen.equals("F")) {
            System.out.println("Hello Ms. "+ splitring[splitring.length-1] + ", " + splitring[0]);
        } else 
        System.out.println("Hello Mr. "+ splitring[splitring.length-1] + ", " + splitring[0]);
        //namy.add(String.split(name));
        in.close();

    }
}
