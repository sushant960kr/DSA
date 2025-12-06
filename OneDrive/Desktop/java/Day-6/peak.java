/*  Q.No is 852, 162
mountain array is inc first the decresing called as bitonic array
Input: arr = [0,1,0]
Output: 1
*/

import java.util.Arrays;
import java.util.Scanner;

public class peak {
    public static int peakIndexInMountainArray(int[] arr ) {
        int start=0;
        int end=arr.length-1;
        while (start < end ) {
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[mid+1]) {  // u r on dec part
                end=mid;
            }else { // u r on inc part
                start=mid+1;
            }
        } // jab start aur end ek hi indices ko point krega tb usko print kr dege
        return start;
    }
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
       
        int[] arr=new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt();
        }
        int result= peakIndexInMountainArray(arr);
        System.out.println("Largest element of indice is "+result);
    }
}
