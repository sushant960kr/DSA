import java.util.Arrays;
import java.util.Scanner;
 // Q .no - 744 on L.C
public class ceil {
    static String ceilingOfNumber(String[] arr, String target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // compare using compareTo()
            if (arr[mid].compareTo(target) <= 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return arr[start % arr.length]; 
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.print("Enter the target element: ");
        String target = r.nextLine();

        String[] arr = new String[5];
        System.out.println("Enter the elements (sorted order): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextLine();
        }

        String ans = ceilingOfNumber(arr, target);
        System.out.println("Ceiling element: " + ans);
    }
}
