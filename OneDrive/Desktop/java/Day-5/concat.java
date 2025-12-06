/*
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */

import java.util.Arrays;
import java.util.Scanner;
public class concat {
    static void concatArray(int[] arr, int n){
        int[] num=new int[2*n];
        System.out.print("Before Concatenate: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
            num[i]=arr[i];
            num[i+n]=num[i];
        }
        System.out.println();
        System.out.println("After Concatenate: " + Arrays.toString(num));
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=r.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        concatArray(arr, n);
    }

}