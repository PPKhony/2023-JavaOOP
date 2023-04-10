package question1;
import java.util.*;

public class SoilTempIoT {
    public final int MIN_TEMP = 10;
    public final int MAX_TEMP = 60;
    private int temp;
    private Random rand;

    public SoilTempIoT() {
        rand = new Random();
        this.temp = rand.nextInt(MAX_TEMP-MIN_TEMP+1)+MIN_TEMP;
    }

    public int getTemp() {
        int temp = 0;
        boolean opeator;
        while (temp>MAX_TEMP||temp<MIN_TEMP) {
            opeator = rand.nextBoolean();
            if (opeator) {
                temp = this.temp + rand.nextInt(11);
            } else {
                temp = this.temp - rand.nextInt(11);
            }
        }
        this.temp = temp;
        return temp;
    }
}
