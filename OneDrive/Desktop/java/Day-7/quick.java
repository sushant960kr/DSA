import java.util.Arrays;
import java.util.Scanner;

public class quick {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
    static void sort(int[] arr,int low, int high){
        if (low >= high) {
            return;
        }
        int s=low;
        int e=high;
        int m=(low+high)/2;
        int pivot =arr[m];
        // not sort if its sorted 
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp=arr[s];
                arr[s]= arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        // now pivot is at correct index the sort left and right
        sort(arr, low, e);
        sort(arr, s, high);
    }
}
