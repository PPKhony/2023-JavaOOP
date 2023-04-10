package question1;

import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;

public class SoilTempData implements ActionListener{
    private final int REPORT_ROUND = 10;
    private ArrayList<Integer> data;
    private int round;
    private int nextPrintIndex;
    private Timer time;

    public SoilTempData(SoilTempIoT iot) {
        nextPrintIndex = 0;
        for (int i = 0; i < 100; i++) {
            data.add(iot.getTemp());
        }
    }

    public void start() { 
        final int DELAY = 100;
        //time = new Timer(DELAY );
    }

    public void actionPerformed(ActionEvent e) {
        if (nextPrintIndex%(REPORT_ROUND-1)==0) {
            printStat();
        } else {
            System.out.print(nextPrintIndex+", ");
        }
        nextPrintIndex++;
    }

    public void printStat() {
        System.out.println("********** Report Current Data: **********");
        System.out.println("Total record ");
    }

    
}
