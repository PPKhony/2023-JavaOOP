package final7_Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Countdown implements ActionListener{
    private int count;

    public Countdown(int initCount) {
        count = initCount;
    }

    public void actionPerformed(ActionEvent event) {
        if (count > 0) {
            System.out.println(count);
        } if (count == 0) {
            System.out.println("Happy new year");
        }
        count--;
    }
}
