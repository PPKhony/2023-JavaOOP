/*
 * Pages 32 / q2
 */
package lab03_buyitems;

public class BuyItem {
    private double min;
    private double sum = 0;
    private double[] item = new double[6];

    private void findMin () {
        this.min = item[0];
        for (Double i : item) {
            if (i<min) {
                this.min = i;
            }
        }
         
    }

    private double findSum () {
        for (Double i : item) {
            sum += i;
        }
        return sum;
    }

    public void displayInfo() {
        findMin();
        this.sum = findSum();
        System.out.println("Total price " + this.sum);
        System.out.println("Discount " + this.min);
        System.out.println("Net price " + (this.sum-this.min));
    }

    public void getPrice(double[] price) {
        this.item = (double[])price.clone();
    }
}
