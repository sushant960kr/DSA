import java.util.Arrays;
import java.util.Scanner;

public class inplace {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        mergesortInplace(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesortInplace(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = (s + e) / 2;

        mergesortInplace(arr, s, mid);
        mergesortInplace(arr, mid + 1, e);

        mergeInplace(arr, s, mid, e);
    }

    private static void mergeInplace(int[] arr, int s, int mid, int e) {
        int[] mix = new int[e - s + 1];

        int i = s;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            mix[k++] = arr[i++];
        }
        while (j <= e) {
            mix[k++] = arr[j++];
        }

        // copy back to original array
        for (int x = 0; x < mix.length; x++) {
            arr[s + x] = mix[x];
        }
    }
}
