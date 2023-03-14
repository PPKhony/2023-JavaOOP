package final3_Junit;

public class TestSinglecompare {
    /** Runs the tests. */
    public static void main(String[] args) {
        printTestResult(-10, -5); // negative case x < y
        printTestResult(-12, -15); // negative case y < x
        printTestResult(10, 30); // simple case x < y
        printTestResult(20, 12); // simple case y < x
        printTestResult(3, 3); // equals positive case
        printTestResult(-7, -7); // equals negative case
    }

    private static void printTestResult(int a, int b) {
        Singlecompare comp = new Singlecompare();
        System.out.print("max(" + a + "," + b + ") ==> ");
        System.out.println(comp.max(a, b));
    }
}
