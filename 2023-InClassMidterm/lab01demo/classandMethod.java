 package lab01demo;

public class classandMethod {
    private int score = 0 , PositionX = 0 , PositionY = 0;

    public void SetPosition(int Hdistance , int Vdistance) {
        PositionX += Hdistance;
        PositionY += Vdistance;
        score += 5;
    }

    public void ShowPositon () {
        System.out.println(Integer.toString(PositionX, PositionY));
        System.out.println("Score : " + Integer.toString(score));
    }
}
