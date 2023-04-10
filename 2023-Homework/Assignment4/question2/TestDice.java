package question2;

public class TestDice {
    public static void main(String[] args) {
        RandomDice die1 = new RandomDice(1); // invalid max, using 6 instead
        Tossable die2 = new RandomDice(8);
        Dice die3 = new RandomDice(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("round " + i + ":");
            die1.random(); 
            System.out.printf("Die1 %s (Min=%d Max=%d)\n", die1.toString(),
                    die1.getMinValue(), die1.getMaxValue());
            die2.random();
            System.out.printf("Die2 %s (Min=%d Max=%d)\n", die2.toString(),
                    die2.getMinValue(), die2.getMaxValue());
            ((RandomDice) die3).random();
            System.out.printf("Die3 %s (with Max=%d)\n", die3.toString(),
                    die3.getMaxValue());
        }
    }
}
