//  count the no of rotation
import java.util.Scanner;

public class rotation {
    static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: mid > next → mid is pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2: mid < prev → prev is pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Case 3: duplicates → skip
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // Case 4: left side sorted → pivot on right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            // Case 5: pivot on left
            else {
                end = mid - 1;
            }
        }
        return -1; // array not rotated
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivotWithDuplicate(arr);
        if (pivot == -1) {
            return 0; // array not rotated
        }
        return pivot + 1;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = r.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        System.out.println("No of rotations in array is " + countRotations(arr));
    }
}
