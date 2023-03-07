package lab05Array;

public class Array_OneDimensional {
    private int arr[] = {1,2,3,4,5,6,7,8,9};
    
    public void println() {
        for (int i : arr) {
           System.out.println(Integer.toString(i) +" "+ arr[i-1]); 
        }
    }
    public static void main(String[] args) {
        Array_OneDimensional myObj01 = new Array_OneDimensional();
        myObj01.println();
    }
}
