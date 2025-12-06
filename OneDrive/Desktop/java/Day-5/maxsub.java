// solve through kadane's algorithm

import java.util.Scanner;

public class maxsub {
    static void maxSubArraySum(int[] arr) {
       int curSum=0;
       int maxSum=Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
        curSum +=arr[i];
        if (curSum < 0) {
            curSum=0;
        }
        maxSum=Math.max(curSum, maxSum);
       }
       System.out.println("Our max subarray sum is "+maxSum);
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        maxSubArraySum(arr);
    }
}
