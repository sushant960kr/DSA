import java.util.Arrays;

public class swap {
    static void swapElement(int[] arr, int index0, int index1) {
        if (index0 < 0 || index0 >= arr.length || index1 < 0 || index1 >= arr.length) {
            System.out.println("Invalid indices! Cannot swap.");
            return;
        }
        int temp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + Arrays.toString(arr));

        swapElement(arr, 0, 4); // Swap first and last element

        System.out.println("After swap: " + Arrays.toString(arr));
    }
}
