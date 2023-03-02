package p3_monster;

public class Monster {
    //Instance variables ตัวแปรวัตถุ
    private boolean isSleep;
    private int positionX;
    private int positionY;
    private double eyeSight;
    private long expPoint;

    public void gainExperience() {
        expPoint = expPoint + 100;
        eyeSight = 5.0 + expPoint / 1000.0f;
    }
    
}
