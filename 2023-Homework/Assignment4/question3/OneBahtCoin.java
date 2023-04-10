package question3;
import question2.*;
import java.util.*;

public class OneBahtCoin implements Tossable{
    private int value;

    public OneBahtCoin() {
        Random rand = new Random();
        this.value = rand.nextInt(2);
    }

    public String getName() {
        return "1Baht Coin";
    }

    public int getResult() {
        return this.value;
    }
    

    public int getMinValue() {
        return 0;
    }

    public int getMaxValue() {
        return 1;
    }

    public void random() {
        Random rand = new Random();
        this.value = rand.nextInt(2);
    }

    public String toString() {
        return String.format("%s [state=Tail(%d)]",getName(),this.value);
    }
}
