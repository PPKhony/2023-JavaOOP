import java.util.*;
public class TimeLapse {
    public int convertToMinutes(int hour) {
        return hour*60;
    }

    public int findDuration(int HI, int MI, int HS, int MS) {
        HI *= 60;
        HS *= 60;
        
        HI += MI;
        HS += MS;

        int result;
         if ((HS-HI) < 0) {
            result = (HS-HI) + 720;
         } else {
            result = (HS-HI);
         }
        System.out.println((result)/60 + " Hours " + (result)%60 + " Minutes");
        return result;
    }

    public static void main(String[] args) {
        TimeLapse time1 = new TimeLapse();
        Scanner in = new Scanner(System.in);
        int HI,MI,HS,MS;
        System.out.print("Start time ");
        HI = in.nextInt();
        MI = in.nextInt();
        System.out.print("Stop time ");
        HS = in.nextInt();
        MS = in.nextInt();
        time1.findDuration(HI,MI,HS,MS);
        in.close();
    }    
}
