/*implementing a pivot finder (basically the index of the 
largest element) in a rotated sorted array with duplicates.
 */
import java.util.Scanner;

public class pivot {
    static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 4 cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements at start, mid, end are equal → skip duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check if end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted → pivot must be in right side
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } 
            // pivot is in left side
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        int pivot = findPivotWithDuplicate(arr);
        if (pivot != -1) {
            System.out.println("Pivot found at index: " + pivot + " (element = " + arr[pivot] + ")");
        } else {
            System.out.println("No pivot found (array might not be rotated).");
        }
    }
}
