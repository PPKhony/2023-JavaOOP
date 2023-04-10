package question2;

public class Dice{
    public final int MIN_VALUE = 1;
    private int value;
    private int maxValue;
    
    public Dice(int maxValue) {
        if (maxValue>MIN_VALUE&&maxValue<=10) {
          this.maxValue = maxValue;  
        } else {
            this.maxValue = 6;
        }
    }

    public int getValue() {
        return this.value;
    } 

    public void setValue(int value) {
        if (value<=maxValue&&value>=MIN_VALUE) {
            this.value = value;  
        } 
    }

    public int getMaxValue() {
        return this.maxValue;
    }
}
