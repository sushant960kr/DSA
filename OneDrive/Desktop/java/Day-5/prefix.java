/*Running Sum of 1d Array i.e, prefix sum 
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running  [1, 1+2, 1+2+3, 1+2+3+4].
 */

import java.util.Scanner;

public class prefix {
    static void prefixSum(int[] arr, int n){
        int[] runSum=new int[n];
        runSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            runSum[i] = runSum[i - 1] + arr[i];
        }
        System.out.println("Prefix Sum of array is ");
        for (int i = 0; i < runSum.length; i++) {
            System.out.print(runSum[i]+" ");
        }
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
        prefixSum(arr, n);
    }
}
