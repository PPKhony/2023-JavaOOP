package lab02Controlstatement.exercise2;

public class DoSummation {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 500; i++) {
            sum += i;
        }
        System.out.println(sum);
        
        sum = 0;
        for (int i = 5; i <= 800; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
