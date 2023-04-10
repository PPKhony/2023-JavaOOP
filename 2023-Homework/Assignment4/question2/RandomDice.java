package question2;
import java.util.*;

public class RandomDice extends Dice implements Tossable{
    public RandomDice() {
        super(6);
    }

    public RandomDice(int maxValue) {
        super(maxValue);
    }

    public String getName() {
        return super.getMaxValue() + "- side die";
    }

    public int getResult() {
        return super.getValue();
    }

    public int getMinValue() {
        return super.MIN_VALUE;
    }

    public int getMaxValue() {
        return super.getMaxValue();
    }

    public void random() {
        Random rand = new Random();
        super.setValue(rand.nextInt(super.getMaxValue()-1)+1);
    }

    public String toString() {
        return String.format("%d-side die value=%d", super.getMaxValue(),super.getValue());
    }
}
