package final7_Timer;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * This program tests the Timer class.
 */
public class TimerTest {
    public static void main(String[] args) {
        Countdown listener = new Countdown(10);
        final int DELAY = 1000; // milliseconds between timer ticks2023-InclassFinal/final7_Timer/TimerTest.java
        Timer t = new Timer(DELAY, listener);
        t.start();
        JOptionPane.showMessageDialog(null, "Quit?");
    }
}
