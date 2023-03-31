package final5_Monstergame;

public class Movinggame {
    private Movable object;

    //Set movable object 
    
    public void setObject(Movable x) {
        object = x;
    }

    public void setPostion(int x, int y) {
        object.setPositionX(x);
        object.setPositionY(y);
    }

    public Movable getObject() {
        return object;
    }
}

//Service class สำหรับ Interface Monstergame
