package question2;
import java.lang.Math;

public class Loan {
    private double p = 0;
    private double a = 0;
    private double r = 0;
    private double n = 0;

    public void seta(double a) {
        this.a = a;
    }

    public void setr(double r) {
        r /= 100;
        this.r = r / 12; //Convert Interest rate year to month 
    }

    public void setn(double n) {
        this.n = n * 12; //Convert year to month
    }

    public double getCalculateLoan() {
        p = a / ((Math.pow((1+r),n) - 1) / (r * Math.pow((1+r),n)));
        return p;
    }

    public void displayInfo() {
        p = a / ((Math.pow((1+r),n) - 1) / (r * Math.pow((1+r),n)));
        System.out.printf("Your princical is %,.2f Baht \n",a);
        System.out.printf("Your interest rate per month is %.02f percent/month \n",(r * 100));
        System.out.printf("Your month that you pay is %.0f Month \n" , n);
        System.out.printf("Yout amount you pay each month is %,.02f Baht/month", p );
    }
}
