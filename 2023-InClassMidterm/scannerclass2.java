import java.util.Scanner;

	public class scannerclass2{
		public static void main(String[] args) {
			Scanner scanner= new Scanner(System.in);
			System.out.print("Enter a number: ");
			System.out.println("You typed: " + scanner.nextInt()); //อ่านค่า int และ คืนค่า int

			System.out.print("Enter a double: ");
			System.out.println("You typed: " + scanner.nextDouble()); //อ่านค่า double และ คืนค่า double
			scanner.nextLine();

			System.out.print("Enter a line of text: ");
			System.out.println("You typed: " + scanner.nextLine()); //อ่านค่า string และคืนค่า string
            scanner.close();
		}
}

