package lab01DemoAndTestVScode;
import java.util.Scanner;

public class scannerclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter age :");
        int age = scanner.nextInt();
        
        scanner.nextLine();
        System.out.print("Please enter name :");
        String name = scanner.nextLine();

        scanner.close();
        
        String age_1 = Integer.toString(age);
        
        System.out.println("Hello " + name + " your age is "+ age_1); 
    }
}
