package question1;
import java.util.Scanner;

public class Calculatortest {
    public static void main(String[] args) {
        System.out.print("1. Enter your weight (kg to pound): ");
		Scanner in = new Scanner(System.in);
		float weight = in.nextFloat();
		
		Calculator obj01 = new Calculator();
		weight = obj01.convertKgToPound(weight);
		
		System.out.printf("your weight (pound) : %.4f \n", weight);
		
		
		/**/
		
		Calculator obj02 = new Calculator();
        System.out.print("2. Enter Temperature (farenheit) :"); 
		float farenheit1 = in.nextFloat();
		float celsius1 = obj02.convertFarenheitToCelsius(farenheit1);
		System.out.printf("convert farenheit to celsius %c %,.02f %c%c \n",'\u2192',celsius1 ,'\u00b0','C');

        /**/

        Calculator obj03 = new Calculator();
        System.out.print("3. Enter Temperature (farenheit) :"); 
		float farenheit2 = in.nextFloat();
		float celsius2 = obj03.convertFarenheitToCelsius(farenheit2);
		System.out.printf("convert farenheit to celsius %c %,.02f %c%c \n",'\u2192',celsius2 ,'\u00b0','C');

        in.close();
    }
}
