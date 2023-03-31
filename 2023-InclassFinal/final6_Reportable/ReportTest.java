package final6_Reportable;

import java.util.ArrayList;
import java.util.*;
public class ReportTest {
    
    public static void main(String[] args) {
        ArrayList<Reportable> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(new Item("Item ",rand.nextInt(100)));
        }
        for (Reportable reportable : list) {
            reportable.report();
        }   
    }
}
