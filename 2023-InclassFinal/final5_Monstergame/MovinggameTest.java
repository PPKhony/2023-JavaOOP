package final5_Monstergame;

public class MovinggameTest {
    public static void main(String[] args) {
        Movinggame game = new Movinggame();
        game.setObject(new Monster());
        game.setPostion(5,6);
        Movable obje = game.getObject();
        System.out.println(obje);

        game.setObject(new Person());
        game.setPostion(55,6);
        Movable obje1 = game.getObject();
        System.out.println(obje1);

        //ทดสอบการใช้คำสั่ง Instance of
        if (game instanceof Movable) {
            System.out.println("true");
        } else System.out.println("false");

        if (game instanceof Movinggame) {
            System.out.println("true");
        } else System.out.println("false");
    }
}
