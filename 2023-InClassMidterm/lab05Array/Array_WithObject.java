package lab05Array;

public class Array_WithObject {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i : arr) {
            arr[i] = i*2;
        }
    }
}
