public class App {
    public static void main(String[] args) {
        String a = "Hello world";
        System.out.println(a.length());

        int[] ArrI = new int[3];
        for (int i = 0; i < ArrI.length; i++) {
            ArrI[i] = i;
        }

        int[][] Arr = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                 Arr[i][j] = i+j;
                 System.out.println(Arr[i][j]);
            }
        }
        
        
    }
}
