import java.util.Scanner;
public class scannerclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer");
        int x = scanner.nextInt();

        System.out.print("Please enter string");
        String y = scanner.nextLine();

        scanner.close();

        System.out.println(y + Integer.toString(x));
    }
}