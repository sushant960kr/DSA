//  binary search nd time complexity is O( log n)

import java.util.Arrays;
import java.util.Scanner;

public class binary {
    static int binarySearch(int[] arr, int num){ 
        int start=0, end=arr.length-1;
        while (start<=end) {
            int mid=(start+end )/2;
            // comparison
            if (arr[mid]==num) {
                return mid;
            }
            if (arr[mid] < num) { //right
                start=mid+1;
            }else{  // left
                end=mid-1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.print("Enter the key: ");
        int num=r.nextInt();
        int[] arr=new int[6];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        Arrays.sort(arr); // Ensure the array is sorted

        int index = binarySearch(arr, num);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
