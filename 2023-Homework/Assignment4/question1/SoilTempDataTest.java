package question1;
import javax.swing.*;

public class SoilTempDataTest {
    public static void main(String[] args) {
        SoilTempData sensor = new SoilTempData(new SoilTempIoT());
        sensor.start();
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}
